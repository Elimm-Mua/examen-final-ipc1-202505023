package com.mycompany.examen_final;

public class NodoDoble {

    private Cancion d;
    private NodoDoble ant;
    private NodoDoble sig;

    public NodoDoble(Cancion d) {
        this.d = d;
        this.ant = null;
        this.sig = null;
    }

    public Cancion getD() {
        return d;
    }

    public void setD(Cancion d) {
        this.d = d;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }
}