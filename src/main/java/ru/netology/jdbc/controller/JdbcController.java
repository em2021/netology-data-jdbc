package ru.netology.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.service.JdbcService;

import java.sql.SQLException;
import java.util.List;

@RestController
public class JdbcController {

    @Autowired
    JdbcService jdbcService;

    @RequestMapping("/products/fetch-product")
    public List<String> getProduct(String name) throws SQLException {
        return jdbcService.getProduct(name);
    }
}