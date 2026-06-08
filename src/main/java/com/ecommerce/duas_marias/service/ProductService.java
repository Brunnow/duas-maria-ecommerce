package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.payload.ProductDTO;
import com.ecommerce.duas_marias.payload.ProductResponse;


public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, ProductDTO product);

    ProductDTO deleteProduct(Long productId);
}
