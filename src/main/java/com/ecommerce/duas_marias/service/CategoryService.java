package com.ecommerce.duas_marias.service;

import com.ecommerce.duas_marias.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    void createCategory(Category category);

}
