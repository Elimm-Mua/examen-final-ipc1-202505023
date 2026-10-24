package com.mycompany.examen_final;

public class Playlist {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tam;

    public Playlist() {
        cabeza = null;
        cola = null;
        actual = null;
        tam = 0;
    }

    public void agregarCancion(Cancion c) {

        NodoDoble n = new NodoDoble(c);

        if (cabeza == null) {

            cabeza = n;
            cola = n;
            actual = n;

        } else {

            cola.setSig(n);
            n.setAnt(cola);
            cola = n;
        }

        tam++;
    }

    public void mostrarPlaylist() {

        NodoDoble n = cabeza;

        while (n != null) {

            n.getD().reproducir();
            n = n.getSig();
        }
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public NodoDoble getCola() {
        return cola;
    }

    public NodoDoble getActual() {
        return actual;
    }

    public void setActual(NodoDoble actual) {
        this.actual = actual;
    }

    public int getTam() {
        return tam;
    }
}