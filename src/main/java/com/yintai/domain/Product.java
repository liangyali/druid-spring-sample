package com.yintai.domain;

import java.util.List;

/**
 * 商品领域模型
 */
public class Product {
    private int id;
    private String name;
    private List<Sku> skus;

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
