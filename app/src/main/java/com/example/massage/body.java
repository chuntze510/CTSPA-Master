package com.example.massage;

public class body {
    private int bodytype_img;
    private String name;

    public body(int bodytype_img, String name) {
        this.bodytype_img = bodytype_img;
        this.name = name;
    }

    public int getBodytype_img() {
        return bodytype_img;
    }

    public void setBodytype_img(int bodytype_img) {
        this.bodytype_img = bodytype_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
