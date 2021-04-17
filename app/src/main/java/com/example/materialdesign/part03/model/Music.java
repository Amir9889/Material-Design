package com.example.materialdesign.part03.model;

public class Music {

    private String name, song, time, link_img, favorite, count;

    public Music() {
    }

    public Music(String link_img) {
        this.link_img = link_img;
    }


    /*
    In below constructor, we use name_song az a link of video so notice this part!!!!!!!!!
     */
    public Music(String name_song, String link_img) {
        this.song = name_song;
        this.link_img = link_img;
    }

    public Music(String name, String song, String link_img) {
        this.name = name;
        this.song = song;
        this.link_img = link_img;
    }

    public Music(String name, String song, String time, String link_img) {
        this.name = name;
        this.song = song;
        this.time = time;
        this.link_img = link_img;
    }

    public Music(String name, String song, String link_img, String favorite, String count) {
        this.name = name;
        this.song = song;
        this.link_img = link_img;
        this.favorite = favorite;
        this.count = count;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }
}
