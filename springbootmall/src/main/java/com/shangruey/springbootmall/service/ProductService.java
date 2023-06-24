package com.shangruey.springbootmall.service;

import com.shangruey.springbootmall.constant.ProductCategory;
import com.shangruey.springbootmall.dto.ProductRequest;
import com.shangruey.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById (Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
