package com.manhnguyen.bookshopwebsite.service;

import com.manhnguyen.bookshopwebsite.dto.CartDTO;
import com.manhnguyen.bookshopwebsite.dto.CartItemDTO;
import jakarta.servlet.http.HttpSession;

public interface CartService {
    void addToCart(HttpSession session, CartItemDTO cartItem);

    void updateCartItemQuantity(HttpSession session, Long productId, int quantity);

    void removeCartItem(HttpSession session, Long productId);

    void clearCart(HttpSession session);

    CartDTO getCart(HttpSession session);
}

