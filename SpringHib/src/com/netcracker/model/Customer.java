package com.netcracker.model;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "district", nullable = false)
    private String district;
    @Column(name = "discount",nullable = false)
    private int discount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Customer() {
    }

    public Customer(String surname, String district, int discount) {
        this.surname = surname;
        this.district = district;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id: " + id +
                ", surname: " + surname +
                ", district: " + district +
                ", discount: " + discount +"}";
    }
}
