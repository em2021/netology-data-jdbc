package ru.netology.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.jdbc.repository.JdbcRepository;

import java.sql.SQLException;
import java.util.List;

@Service
public class JdbcService {

    @Autowired
    JdbcRepository jdbcRepository;

    public List<String> getProduct(String name) throws SQLException {
        return jdbcRepository.getProductName(name);
    }
}