package com.reto.demo.Domain.service;


import com.reto.demo.Domain.dto.Estudiante;
import com.reto.demo.Domain.repository.RepositorioEstudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {


    private final RepositorioEstudiante repositorioEstudiante;


    // Constructor con inyección de dependencias
    public EstudianteService() {
        repositorioEstudiante = new RepositorioEstudiante(); // Puedes cambiar esto por una implementación de repositorio real
    }

    //Metodo para agregar estudiastes
    public void agregarEstudianste(){

    }

    // Método para obtener todos los estudiantes
    public List<Estudiante> obtenerEstudiantes()
    {
        return repositorioEstudiante.obtenerEstudiantes();
    }


    // Método para filtar estudiante por el campo nombre
    public List<Estudiante> obtenerEstudiantePorNombre(String nombre)
    {
        return  repositorioEstudiante.obtenerEstudiantePorNombre(nombre);
    }

    // Método para filtar estudiante por el campo numero de celular
    public List<Estudiante> obtenerEstudiantePorCelular(String celular)
    {
        return  repositorioEstudiante.obtenerEstudiantePorCelular(celular);
    }

    // Método para filtar estudiante por el campo promedio de notas
    public List<Estudiante> obtenerEstudiantePorPromedioNotas(double promedioNotas)
    {
        return  repositorioEstudiante.obtenerEstudiantePorPromedioNotas(promedioNotas);
    }




}
