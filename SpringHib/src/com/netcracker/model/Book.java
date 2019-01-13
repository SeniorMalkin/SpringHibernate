package com.netcracker.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "cost")
    private float cost;
    @Column(name = "storage")
    private String storage;
    @Column(name = "bcount")
    private int count;

    public Book() {
    }

    public Book(String title, float cost, String storage, int count) {
        this.title = title;
        this.cost = cost;
        this.storage = storage;
        this.count = count;
    }

    @Override
    public String toString() {
        return  "Book{id: " + id +
                ", title: " + title +
                ", cost: " + cost +
                ", storage: " + storage +
                ", count: " + count + "}";
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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
