package com.shangruey.springbootmall.dao;

import com.shangruey.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById (Integer productId);
}
