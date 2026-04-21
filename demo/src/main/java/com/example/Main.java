package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<EspacioCultural> espacios = new ArrayList<>();

        espacios.add(new JardinBotanico());
        espacios.add(new MuseoDeAntioquia());
        espacios.add(new ParqueExplora());

        for (EspacioCultural espacio : espacios) {
            System.out.println("Lugar: " + espacio.obtenerNombre());
            espacio.mostrarHorario();
            System.out.println("Requisito: " + espacio.obtenerRequisitoEntrada());
            espacio.realizarActividadPrincipal();
            System.out.println("------------------------------");
        }
    }
}