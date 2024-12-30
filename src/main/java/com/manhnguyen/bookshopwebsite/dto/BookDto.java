package com.manhnguyen.bookshopwebsite.dto;

import com.manhnguyen.bookshopwebsite.entity.Book;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Book}
 */
@Data
@Value
public class BookDto implements Serializable {
    String title;
    Double totalRevenue;

}