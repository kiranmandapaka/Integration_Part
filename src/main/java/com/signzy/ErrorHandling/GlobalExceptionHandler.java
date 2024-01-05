package com.signzy.ErrorHandling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.naming.AuthenticationException;
import java.nio.file.AccessDeniedException;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + e.getMessage());
    }


    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> handleAccessDeniedException(AccessDeniedException e) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Access denied: " + e.getMessage());
    }
    @ExceptionHandler(com.signzy.ErrorHandling.AuthenticationException.class)
    public ResponseEntity<String> handleAuthenticationException(com.signzy.ErrorHandling.AuthenticationException e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed: " + e.getMessage());
    }
    @ExceptionHandler(com.signzy.ErrorHandling.InvalidRequestException.class)
    public ResponseEntity<String> handleInvalidRequestException(com.signzy.ErrorHandling.InvalidRequestException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid request: " + e.getMessage());
    }
    @ExceptionHandler(com.signzy.ErrorHandling.InternalServerError.class)
    public ResponseEntity<String> handleInvalidRequestException(com.signzy.ErrorHandling.InternalServerError e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid request: " + e.getMessage());
    }

    @ExceptionHandler(com.signzy.ErrorHandling.ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(com.signzy.ErrorHandling.ResourceNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found: " + e.getMessage());
    }
    @ExceptionHandler(com.signzy.ErrorHandling.ConfilctException.class)
    public ResponseEntity<String> handleResourceNotFoundException(com.signzy.ErrorHandling.ConfilctException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Resource not found: " + e.getMessage());
    }

//    @ExceptionHandler(ValidationException.class)
//    public ResponseEntity<Map<String, String>> handleValidationException(ValidationException e) {
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body((Map<String, String>) e.getFieldErrors());
//    }

}
