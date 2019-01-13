package com.netcracker.service;

import com.netcracker.model.Shop;

import java.util.List;

public interface IShopService extends IBasicService<Shop> {
    void saveShop(Shop entity);
    void deleteShop(Shop entity);
    List<Shop> findByTitle(String title);
    List<String> shopsSormAndSovetDist();
}
