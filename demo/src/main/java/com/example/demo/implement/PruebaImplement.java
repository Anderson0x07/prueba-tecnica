package com.example.demo.implement;

import com.example.demo.entity.Prueba;
import com.example.demo.repository.PruebaRepository;
import com.example.demo.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PruebaImplement implements PruebaService {

    @Autowired
    private PruebaRepository medicamentoRepository;

    @Override
    public List<Prueba> listarMedicamentos() {

        List<Prueba> medicamentos = medicamentoRepository.findAll();

        if(medicamentos.isEmpty()) {
            System.out.println("ERRRRRRRRRRRRRRORRRRRRRRRRRRRRRR");
        }
        return medicamentos;
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public String getOracleVersion() {
        return jdbcTemplate.queryForObject("SELECT banner FROM v$version WHERE ROWNUM = 1", String.class);
    }

}
