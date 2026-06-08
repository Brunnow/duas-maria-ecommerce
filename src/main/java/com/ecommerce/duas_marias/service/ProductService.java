package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.model.Product;
import com.ecommerce.duas_marias.payload.ProductDTO;
import com.ecommerce.duas_marias.payload.ProductResponse;
import org.springframework.stereotype.Service;


public interface ProductService {
    ProductDTO addProduct(Long categoryId, Product product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, Product product);

    ProductDTO deleteProduct(Long productId);
}
