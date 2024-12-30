package com.manhnguyen.bookshopwebsite.service;

import com.manhnguyen.bookshopwebsite.dto.CategoryDto;
import com.manhnguyen.bookshopwebsite.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    Page<Category> getAllCategories(Pageable pageable);

    List<Category> getAllCategories();

    Category getCategoryById(Long categoryId);

    void addCategory(Category category);

    void updateCategory(Long categoryId, Category updatedCategory);

    void deleteCategory(Long categoryId);

    List<CategoryDto> getTop10BestSellerByMonth(int selectedValue);

}