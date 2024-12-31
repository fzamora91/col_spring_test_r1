package com.reto.demo.Domain.repository;

import com.reto.demo.Domain.dto.Direccion;
import com.reto.demo.Domain.dto.Estudiante;
import com.reto.demo.Domain.dto.Persona;

import java.util.ArrayList;
import java.util.List;

public class RepositorioEstudiante
{

    private List<Estudiante> estudiantes;

    // Constructor
    public RepositorioEstudiante() {
        estudiantes = new ArrayList<>();
        agregarEstudiantes();
    }

    // Método para agregar estudiantes
    private void agregarEstudiantes() {
        // Creamos direcciones para cada persona
        Direccion direccionJuan = new Direccion("Calle Falsa 123", "Ciudad A", "Estado A", "12345", "Pais A");
        Direccion direccionAna = new Direccion("Calle Real 456", "Ciudad B", "Estado B", "67890", "Pais B");
        Direccion direccionCarlos = new Direccion("Calle Verdadera 789", "Ciudad C", "Estado C", "11223", "Pais C");

        // Agregar estudiantes con la dirección correspondiente
        estudiantes.add(new Estudiante(new Persona("Juan", "123456789", "juan@email.com", direccionJuan), 1, 8.5f));
        estudiantes.add(new Estudiante(new Persona("Ana", "987654321", "ana@email.com", direccionAna), 2, 9.0f));
        estudiantes.add(new Estudiante(new Persona("Carlos", "456789123", "carlos@email.com", direccionCarlos), 3, 7.8f));
        // ... (agregar más estudiantes)
    }

    // Método para obtener todos los estudiantes
    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

}
