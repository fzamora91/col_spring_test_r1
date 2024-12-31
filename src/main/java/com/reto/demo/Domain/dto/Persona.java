package com.reto.demo.Domain.dto;

public class Persona {

    public String nombre;
    public String numeroCelular;
    public String correoElectronico;
    public Direccion direccion;



    public Persona(String nombre, String numeroCelular, String correoElectronico, Direccion direccion) {

        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;

    }

    public void comprarPaseEstacionamiento()
    {

    }
}
