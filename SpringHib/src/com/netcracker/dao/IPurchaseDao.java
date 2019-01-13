package com.netcracker.dao;

import com.netcracker.model.Purchase;

import java.util.List;

public interface IPurchaseDao extends IBasicDao<Purchase> {
    List<Integer> getMonths();
    List<String> getInfo();
    List<String> getDetailInfo();
    List<String> getBigPurchase();
}
