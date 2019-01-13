package com.netcracker.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "shop")
    private Shop shop;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "book")
    private Book book;
    @Column(name = "pcount")
    private int pcount;
    @Column(name = "total")
    private float sum;

    public Purchase() {
    }

    public Purchase(Date date, Shop shop, Customer customer, Book book, int pcount) {
        this.date = date;
        this.shop = shop;
        this.customer = customer;
        this.book = book;
        this.pcount = pcount;
        this.sum = book.getCost()*pcount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getPcount() {
        return pcount;
    }

    public void setPcount(int pcount) {
        this.pcount = pcount;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Purchase{ id: " + id +
                ", date: "  + date.toString() +
                ", shop: "  + shop.toString() +
                ", customer: " + customer.toString() +
                ", book: " + book.toString() +
                ", count: " + pcount +
                ", sum: " + sum + " }";
    }
}
