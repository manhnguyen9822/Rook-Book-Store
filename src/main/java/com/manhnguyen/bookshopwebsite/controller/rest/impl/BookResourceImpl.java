package com.manhnguyen.bookshopwebsite.controller.rest.impl;

import com.manhnguyen.bookshopwebsite.controller.rest.IBookResource;
import com.manhnguyen.bookshopwebsite.controller.rest.base.RestApiV1;
import com.manhnguyen.bookshopwebsite.controller.rest.base.VsResponseUtil;
import com.manhnguyen.bookshopwebsite.entity.Book;
import com.manhnguyen.bookshopwebsite.service.BookService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestApiV1
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BookResourceImpl implements IBookResource {

    BookService bookService;

    @Override
    public ResponseEntity<?> getBookById(Long bookId) {
        return VsResponseUtil.ok(HttpStatus.OK, bookService.getBookById(bookId));
    }

    @Override
    public ResponseEntity<?> getBookListPaginatedAndSorted(String sortBy, Long categoryId, int page, int size) {
        List<Book> bookList;
        if(categoryId != null){
            bookList = bookService.getAllBooksByCategoryId(categoryId);
        }
        else {
            bookList = bookService.findAll();
        }

        List<Book> sortedBookList;

        switch (sortBy){
            case "price-low-to-high":
                sortedBookList = bookList.stream()
                        .sorted(Comparator.comparing(Book::getSalePrice))
                        .collect(Collectors.toList());
            case "price-high-to-low":
                sortedBookList = bookList.stream()
                        .sorted(Comparator.comparing(Book::getSalePrice).reversed())
                        .collect(Collectors.toList());
            case "newest":
                sortedBookList = bookList.stream()
                        .sorted(Comparator.comparing(Book::getPublishedDate))
                        .collect(Collectors.toList());
            case "oldest":
                sortedBookList = bookList.stream()
                        .sorted(Comparator.comparing(Book::getPublishedDate).reversed())
                        .collect(Collectors.toList());
            default:
                sortedBookList = bookList;
        }
        return VsResponseUtil.ok(HttpStatus.OK, sortedBookList);
    }
}
