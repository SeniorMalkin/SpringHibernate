package com.netcracker.service;

import com.netcracker.dao.IPurchaseDao;
import com.netcracker.model.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("purchaseService")
public class PurchaseService extends BasicService<Purchase> implements IPurchaseService {
    @Autowired
    IPurchaseDao dao;

    public void savePurchase(Purchase entity) {
        dao.save(entity);
    }

    public void deletePurchase(Purchase entity) {
        dao.deleteByObject(entity);
    }

    public List<Integer> getAllMonths(){
       return dao.getMonths();
    }

    public List<String> getInfo() {
        return dao.getInfo();
    }

    public List<String> getDetailInfo() {
        return dao.getDetailInfo();
    }

    public List<String> getBigPurchases() {
        return dao.getBigPurchase();
    }
}
