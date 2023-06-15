package com.example.tpbataillenavale.entity;

public class Case {
    int horizontal;
    int vertical;
    boolean toucher = false;

    public Case(int horizontal, int vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    public boolean isToucher() {
        return toucher;
    }

    public void setToucher(boolean toucher) {
        this.toucher = toucher;
    }
}
