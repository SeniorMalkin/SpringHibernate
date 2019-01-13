package com.netcracker.dao;

import com.netcracker.model.Shop;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository("shopDAO")
@Transactional
public class ShopDAOImpl extends BasicDAO<Shop> implements IShopDao {

    public List<Shop> find(String title) {
        Query query = getSession().createQuery("FROM Shop WHERE title = :title");
        query.setString("title",title);
        return (List<Shop>) query.list();
    }

    public void updateById(int id, Shop entity) {
        Query query = getSession().createQuery("UPDATE Shop set title = :title, district = :district, commision = :commision WHERE id = :id");
        query.setInteger("id",id);
        query.setString("title",entity.getTitle());
        query.setString("district",entity.getDistrict());
        query.setInteger("commision",entity.getCommision());
        query.executeUpdate();

    }

    public List<String> shopsSormovAndSovets() {
        Query query = getSession().createQuery("FROM Shop WHERE district = :district OR district = :district1");
        query.setString("district","Sormovskiy");
        query.setString("district1", "Sovetskiy");
        List<String> res = new ArrayList<String>();
        for(Shop a : (List<Shop>) query.list()){
            String str = "Title: " + a.getTitle();
            res.add(str);

        }
        return res;
    }
}
