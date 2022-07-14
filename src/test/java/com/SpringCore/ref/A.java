package com.SpringCore.ref;

public class A {

    private int x;

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public A() {
        super();
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    private B obj;
}
