package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.payload.CartDTO;

public interface CartService {
     CartDTO addProductToCart(Long productId, Integer quantity);

}
