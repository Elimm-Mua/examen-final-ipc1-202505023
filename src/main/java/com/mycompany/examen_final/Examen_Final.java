package com.mycompany.examen_final;

public class Examen_Final {

    public static void main(String[] args) {

        Cancion c1 = new Cancion(
                "Cancion 1",
                180,
                "Artista 1"
        );

        Cancion c2 = new Cancion(
                "Cancion 2",
                210,
                "Artista 2"
        );

        Cancion c3 = new Cancion(
                "Cancion 3",
                160,
                "Artista 3"
        );

        c1.reproducir();
        c2.reproducir();
        c3.reproducir();
    }
}
