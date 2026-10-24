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
    
    public void siguiente() {

        if (actual != null && actual.getSig() != null) {
            actual = actual.getSig();
            actual.getD().reproducir();
        }
    }

    public void anterior() {

        if (actual != null && actual.getAnt() != null) {
            actual = actual.getAnt();
            actual.getD().reproducir();
        }
    }

    public void eliminarActual() {

        if (actual == null) {
            return;
        }

        NodoDoble ant = actual.getAnt();
        NodoDoble sig = actual.getSig();

        if (ant == null && sig == null) {

            cabeza = null;
            cola = null;
            actual = null;

        } else if (ant == null) {

            cabeza = sig;
            cabeza.setAnt(null);
            actual = cabeza;

        } else if (sig == null) {

            cola = ant;
            cola.setSig(null);
            actual = cola;

        } else {

            ant.setSig(sig);
            sig.setAnt(ant);
            actual = sig;
        }

        tam--;
    }
}