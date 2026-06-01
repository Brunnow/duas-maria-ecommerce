package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.model.Category;
import com.ecommerce.duas_marias.payload.CategoryDTO;
import com.ecommerce.duas_marias.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse getAllCategories();

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    String deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
