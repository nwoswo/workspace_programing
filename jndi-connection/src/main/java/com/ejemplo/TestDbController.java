package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDbController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/testdb")
    public String testDatabaseConnection() {
        String sql = "SELECT COUNT(*) FROM dual";  // Cambia por una tabla válida
        int result = jdbcTemplate.queryForObject(sql, Integer.class);
        return "Conexión exitosa. Resultado de la consulta: " + result;
    }
}
