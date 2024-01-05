package com.signzy.ErrorHandling;

import org.springframework.http.HttpStatus;

public class InvalidRequestException extends RuntimeException {
    public InvalidRequestException(String message) {
        super();
    }


    public HttpStatus getStatusCode() {
        return getStatusCode();
    }
}
