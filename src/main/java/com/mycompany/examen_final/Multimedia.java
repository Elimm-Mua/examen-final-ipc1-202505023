package com.mycompany.examen_final;

public abstract class Multimedia {

    private String t;
    private int d;

    public Multimedia(String t, int d) {
        this.t = t;
        this.d = d;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public abstract void reproducir();
}