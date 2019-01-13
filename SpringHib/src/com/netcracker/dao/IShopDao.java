package com.netcracker.dao;

import com.netcracker.model.Shop;

import java.util.List;

public interface IShopDao extends IBasicDao<Shop> {
    List<Shop> find(String title);
    List<String> shopsSormovAndSovets();
}
