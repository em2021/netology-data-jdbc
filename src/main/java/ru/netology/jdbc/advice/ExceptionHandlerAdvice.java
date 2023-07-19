package ru.netology.jdbc.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.jdbc.exception.NoSuchCustomerException;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(NoSuchCustomerException.class)
    public ResponseEntity<String> nSCEHandler(NoSuchCustomerException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}