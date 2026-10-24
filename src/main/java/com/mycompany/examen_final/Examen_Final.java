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

        Playlist p = new Playlist();

        p.agregarCancion(c1);
        p.agregarCancion(c2);
        p.agregarCancion(c3);

        System.out.println("LISTA INICIAL");
        p.mostrarPlaylist();

        System.out.println("SIGUIENTE");
        p.siguiente();

        System.out.println("SIGUIENTE");
        p.siguiente();

        System.out.println("ANTERIOR");
        p.anterior();

        System.out.println("ELIMINAR ACTUAL");
        p.eliminarActual();

        System.out.println("LISTA FINAL");
        p.mostrarPlaylist();
    }
}