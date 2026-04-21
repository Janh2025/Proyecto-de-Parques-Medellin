package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("Horario: 8:30 AM - 5:30 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Boleta pagada o ingreso según actividad";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Interactuar con experimentos y el acuario...");
    }

    @Override
    public String obtenerNombre() {
        return "Parque Explora";
    }
}
