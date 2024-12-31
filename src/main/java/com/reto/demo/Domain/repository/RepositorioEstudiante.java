package com.reto.demo.Domain.repository;

import com.reto.demo.Domain.dto.Direccion;
import com.reto.demo.Domain.dto.Estudiante;
import com.reto.demo.Domain.dto.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioEstudiante
{

    public List<Estudiante> estudiantes;

    // Constructor
    public RepositorioEstudiante() {
        estudiantes = new ArrayList<>();
        agregarEstudiantes();
    }

    // Método para agregar estudiantes
    public void agregarEstudiantes() {
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

    // Método para filtar estudiante por el campo nombre
    public List<Estudiante> obtenerEstudiantePorNombre(String nombre)
    {

        return obtenerEstudiantes()
                .stream()
                .filter(estudiante -> estudiante.persona.nombre.equalsIgnoreCase(nombre))
                .collect(Collectors.toList());

    }

    // Método para filtar estudiante por el campo numero de celular
    public List<Estudiante> obtenerEstudiantePorCelular(String celular)
    {

        return obtenerEstudiantes()
                .stream()
                .filter(estudiante -> estudiante.persona.numeroCelular.equals(celular))
                .collect(Collectors.toList());

    }

    // Método para filtar estudiante por el campo promedio de notas
    public List<Estudiante> obtenerEstudiantePorPromedioNotas(double promedioNotas)
    {
        return obtenerEstudiantes()
                .stream()
                .filter(estudiante -> estudiante.promedioNotas == promedioNotas)
                .collect(Collectors.toList());
    }


}
