package ru.netology.jdbc.exception;

public class NoSuchCustomerException extends RuntimeException {

    public NoSuchCustomerException(String msg) {
        super(msg);
    }
}
