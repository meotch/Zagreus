package com.ccwtac.zagreus.service;

import com.ccwtac.zagreus.model.Product;

public interface ProductService {

    Iterable<Product> getAllProducts();

    Product getProduct(long id);

    Product save(Product product);
}
