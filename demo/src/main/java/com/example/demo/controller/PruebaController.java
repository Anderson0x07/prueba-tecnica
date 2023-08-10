package com.example.demo.controller;

import com.example.demo.entity.Prueba;
import com.example.demo.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PruebaController {

    @Autowired
    private PruebaService pruebaService;

    @GetMapping("/")
    public List<Prueba> getAll() {
        System.out.println("ENTRENADO");
        return pruebaService.listarMedicamentos();
    }

    @GetMapping("/db")
    public String testDbConnection() {
        try {

            return pruebaService.getOracleVersion();
        } catch (Exception e) {
            return "Error al conectar a la base de datos: " + e.getMessage();
        }
    }

}
