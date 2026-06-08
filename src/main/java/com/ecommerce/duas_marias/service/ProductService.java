package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.payload.ProductDTO;
import com.ecommerce.duas_marias.payload.ProductResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, ProductDTO product);

    ProductDTO deleteProduct(Long productId);

    ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;
}
