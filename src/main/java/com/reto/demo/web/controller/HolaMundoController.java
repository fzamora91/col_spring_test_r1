package com.reto.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/")
public class HolaMundoController
{
    @GetMapping("/saludar")
    public ResponseEntity<String> saludar() {
        return ResponseEntity.ok("¡Hola mundo!");
    }

    @GetMapping("/saludar2")
    public String saludar2() {
        return "¡Hola mundo!";
    }
}