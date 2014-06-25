package com.yintai.service.impl;

import com.yintai.domain.Product;
import com.yintai.repository.ProductRepository;
import com.yintai.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liangyali on 14/6/24.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> list() {
        return productRepository.list();
    }
}
