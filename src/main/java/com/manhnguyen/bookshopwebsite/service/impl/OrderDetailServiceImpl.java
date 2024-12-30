package com.manhnguyen.bookshopwebsite.service.impl;

import com.manhnguyen.bookshopwebsite.entity.Order;
import com.manhnguyen.bookshopwebsite.entity.OrderDetail;
import com.manhnguyen.bookshopwebsite.repository.OrderDetailRepository;
import com.manhnguyen.bookshopwebsite.service.OrderDetailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> getAllOrderDetailByOrder(Order order) {
        return orderDetailRepository.findByOrder(order);
    }
}
