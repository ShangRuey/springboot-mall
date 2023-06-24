package com.shangruey.springbootmall.dao;


import com.shangruey.springbootmall.dto.ProductQueryParams;
import com.shangruey.springbootmall.dto.ProductRequest;
import com.shangruey.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById (Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
