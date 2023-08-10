package com.example.demo.service;

import com.example.demo.entity.Prueba;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PruebaService {

    public List<Prueba> listarMedicamentos();

    public String getOracleVersion();

}
