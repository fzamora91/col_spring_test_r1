package com.reto.demo.web.controller;


import com.reto.demo.Domain.dto.Estudiante;
import com.reto.demo.Domain.params.EstudiantePorCelular;
import com.reto.demo.Domain.params.EstudiantePorNombre;
import com.reto.demo.Domain.params.EstudiantePorPromedio;
import com.reto.demo.Domain.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    private final EstudianteService estudianteService;

    @Autowired
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/todos")
    public List<Estudiante> obtenerEstudiantes()
    {
        return estudianteService.obtenerEstudiantes();
    }

    @PostMapping("/filtrarPorNombre")
    public List<Estudiante> obtenerEstudiantesPorNombre(@RequestBody EstudiantePorNombre estudiante)
    {

        return estudianteService.obtenerEstudiantePorNombre(estudiante.Nombre);

    }

    @PostMapping("/filtrarPorCelular")
    public List<Estudiante> obtenerEstudiantesPorCelular(@RequestBody EstudiantePorCelular estudiante)
    {
        return estudianteService.obtenerEstudiantePorCelular(estudiante.celular);
    }

    @PostMapping("/filtrarPorPromedioNotas")
    public List<Estudiante> obtenerEstudiantesPorPromediosNotas(@RequestBody EstudiantePorPromedio estudiante)
    {
        return estudianteService.obtenerEstudiantePorPromedioNotas(estudiante.promedio);
    }



}
