package com.manhnguyen.bookshopwebsite.service;

import com.manhnguyen.bookshopwebsite.dto.BookDto;
import com.manhnguyen.bookshopwebsite.dto.CategoryDto;
import com.manhnguyen.bookshopwebsite.dto.OrderDTO;
import com.manhnguyen.bookshopwebsite.entity.User;

import java.util.List;

public interface ExportService {

    String exportOrderReport(User user, List<OrderDTO> orderDTOList, String keyword);

    String exportCategoryReport(User user, List<CategoryDto> categoryDTOList, String keyword);

    String exportBookReport(User user, List<BookDto> bookDtoList, String keyword);

}
