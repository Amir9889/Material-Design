package com.example.materialdesign.part04.model;

public class Wally {

    private String name, link_img;

    public Wally() {
    }

    public Wally(String link_img) {
        this.link_img = link_img;
    }

    public Wally(String name, String link_img) {
        this.name = name;
        this.link_img = link_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }
}
