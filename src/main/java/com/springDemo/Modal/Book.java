package com.springDemo.Modal;

import jakarta.persistence.*;

@Entity
@Table(name = "Books")
public class Book {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;

    public Book() {
    }

    public Book(int id, String name, String writer, int price) {
        Id = id;
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    private String writer;
    private int price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
