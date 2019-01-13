package com.netcracker.model;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "district")
    private String district;
    @Column(name = "commision")
    private int commision;

    public Shop() {
    }

    public Shop(String title, String district, int commision) {
        this.title = title;
        this.district = district;
        this.commision = commision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    @Override
    public String toString() {
        return "Shop{ Title: " + title +
                " , District: " + district +
                " , Commision: " + commision +" }";
    }
}
