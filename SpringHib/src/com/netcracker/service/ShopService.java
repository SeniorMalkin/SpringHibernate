package com.netcracker.service;

import com.netcracker.dao.IShopDao;
import com.netcracker.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shopService")
public class ShopService extends BasicService<Shop> implements IShopService {
    @Autowired
    IShopDao dao;

    public void saveShop(Shop entity) {
        dao.save(entity);
    }

    public void deleteShop(Shop entity) {
        dao.deleteByObject(entity);
    }

    public List<Shop> findByTitle(String title) {
        return dao.find(title);
    }

    public List<String> shopsSormAndSovetDist() {
        return dao.shopsSormovAndSovets();
    }
}
