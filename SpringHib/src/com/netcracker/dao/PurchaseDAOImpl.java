package com.netcracker.dao;

import com.netcracker.model.Purchase;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository("purchaseDAO")
@Transactional
public class PurchaseDAOImpl extends BasicDAO<Purchase> implements IPurchaseDao {
    public void updateById(int id, Purchase entity) {
        Query query = getSession().createQuery("UPDATE Purchase set date = :date, shop = :shop, customer = :customer, book = :book, pcount = :pcount, sum =:sum WHERE id = :id");
        query.setInteger("id",id);
        query.setDate("date",entity.getDate());
        query.setEntity("shop",entity.getShop());
        query.setEntity("customer",entity.getCustomer());
        query.setEntity("book",entity.getBook());
        query.setInteger("pcount",entity.getPcount());
        query.setFloat("sum",entity.getSum());
        query.executeUpdate();
    }

    public List<Integer> getMonths() {
        Query query = getSession().createQuery("SELECT DISTINCT date FROM Purchase");
        List<Integer> result = new ArrayList<Integer>();
        for(Date a :(List<Date>) query.list()){
            result.add(a.getMonth()+ 1);
        }
        return result;
    }

    public List<String> getInfo() {
        List<Purchase> arr = getAll();
        List<String> res = new ArrayList<String>();
        for(Purchase a : arr){
            String str = "Buy: " + a.getCustomer().getSurname() +
                    ", Shop: " + a.getShop().getTitle();
            res.add(str);

        }
        return res;
    }

    public List<String> getDetailInfo() {
        List<Purchase> arr = getAll();
        List<String> res = new ArrayList<String>();
        for(Purchase a : arr){
            String str = "Date: " + a.getDate() + ", Surname: " + a.getCustomer().getSurname() +
                    ", Discount: " + a.getCustomer().getDiscount() +
                    "% , Title book: " + a.getBook().getTitle() +
                    ", Count: " + a.getPcount();
            res.add(str);

        }
        return res;
    }

    public List<String> getBigPurchase() {
        Query query = getSession().createQuery("FROM Purchase WHERE (total > '60000')");
        List<String> res = new ArrayList<String>();
        for(Purchase a : (List<Purchase>) query.list()){
            String str = "Id: " + a.getId() +
                    ", Surname: " + a.getCustomer().getSurname() +
                    ", Date: " + a.getDate();
            res.add(str);
        }
        return res;
    }
}
