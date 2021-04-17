package com.example.materialdesign.part01.model;

public class Book {

    private String name, author, link_img;

    public Book() {
    }

    public Book(String link_img) {
        this.link_img = link_img;
    }

    public Book(String name, String author, String link_img) {
        this.name = name;
        this.author = author;
        this.link_img = link_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }
}
