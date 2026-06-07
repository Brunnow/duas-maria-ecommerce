package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.exceptions.ResourceNotFoundException;
import com.ecommerce.duas_marias.model.Category;
import com.ecommerce.duas_marias.model.Product;
import com.ecommerce.duas_marias.payload.ProductDTO;
import com.ecommerce.duas_marias.payload.ProductResponse;
import com.ecommerce.duas_marias.repositories.CategoryRepository;
import com.ecommerce.duas_marias.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDTO addProduct(Long categoryId, Product product) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() ->new ResourceNotFoundException("Category", "categoryId", categoryId));
        product.setImage("default.png");
        product.setCategory(category);
        double specialPrice = product.getPrice() -
                ((product.getDiscount() * 0.01) * product.getPrice());
        product.setSpecialPrice(specialPrice);
        Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDTO.class);
    }

    @Override
    public ProductResponse getAllProducts() {
     List<Product> products = productRepository.findAll();
     List<ProductDTO> productDTOS = products.stream()
             .map(product -> modelMapper.map(product, ProductDTO.class))
             .collect(Collectors.toList());

     ProductResponse productResponse = new ProductResponse();
     productResponse.setContent(productDTOS);

        return productResponse;
    }
}
