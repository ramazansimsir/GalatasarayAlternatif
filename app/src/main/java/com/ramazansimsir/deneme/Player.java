package com.ramazansimsir.deneme;

import java.io.Serializable;

public class Player implements Serializable {

    String name;
    int value;
    int image;

    public Player(String name, int value,int image) {
        this.name = name;
        this.value = value;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
