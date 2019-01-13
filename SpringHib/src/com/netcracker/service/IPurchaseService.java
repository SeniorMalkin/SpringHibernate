package com.netcracker.service;

import com.netcracker.model.Purchase;

import java.util.List;

public interface IPurchaseService extends IBasicService<Purchase> {
    void savePurchase(Purchase entity);
    void deletePurchase(Purchase entity);
    List<Integer> getAllMonths();
    List<String> getInfo();
    List<String> getDetailInfo();
    List<String> getBigPurchases();


}
