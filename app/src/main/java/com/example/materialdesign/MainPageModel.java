package com.example.materialdesign;

public class MainPageModel {

    private String txtPartNum, txtName, link_img;

    public MainPageModel() {
    }

    public MainPageModel(String txtPartNum, String txtName, String link_img) {
        this.txtPartNum = txtPartNum;
        this.txtName = txtName;
        this.link_img = link_img;
    }

    public String getTxtPartNum() {
        return txtPartNum;
    }

    public void setTxtPartNum(String txtPartNum) {
        this.txtPartNum = txtPartNum;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public String getLink_img() {
        return link_img;
    }

    public void setLink_img(String link_img) {
        this.link_img = link_img;
    }
}
