package com.mycompany.examen_final;

public class Cancion extends Multimedia {

    private String a;

    public Cancion(String t, int d, String a) {
        super(t, d);
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public void reproducir() {
        System.out.println("Cancion: " + getT());
        System.out.println("Artista: " + a);
        System.out.println("Duracion: " + getD() + " segundos");
        System.out.println();
    }
}
