package com.manhnguyen.bookshopwebsite.service;

import com.manhnguyen.bookshopwebsite.entity.Order;
import com.manhnguyen.bookshopwebsite.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> getAllOrderDetailByOrder(Order order);
}
