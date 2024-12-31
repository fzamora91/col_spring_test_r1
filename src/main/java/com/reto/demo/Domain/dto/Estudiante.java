package com.reto.demo.Domain.dto;

public class Estudiante {

    public Persona persona;
    public int numeroEstudiante;
    public double promedioNotas;

    public Estudiante(Persona persona, int i, double promedio)
    {

        this.persona=persona;
        this.numeroEstudiante = i;
        this.promedioNotas = promedio;


    }


    public double getPromedioNotas() {
        return promedioNotas;
    }

}
