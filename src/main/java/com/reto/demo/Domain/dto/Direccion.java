package com.reto.demo.Domain.dto;

public class Direccion {

    public String direccion;
    public String ciudad;
    public String estado;
    public String codigoPostal;
    public String pais;


    public Direccion(String direccion, String ciudadA, String estadoA, String codigoPostal, String pais){

        this.direccion = direccion;
        this.ciudad=ciudadA;
        this.estado= estadoA;
        this.codigoPostal = codigoPostal;
        this.pais = pais;

    }


}
