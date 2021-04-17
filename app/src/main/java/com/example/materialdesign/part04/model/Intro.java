package com.example.materialdesign.part04.model;

public class Intro {

    private String description;
    private int lottie;

    public Intro(String description, int lottie) {
        this.description = description;
        this.lottie = lottie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLottie() {
        return lottie;
    }

    public void setLottie(int lottie) {
        this.lottie = lottie;
    }
}
