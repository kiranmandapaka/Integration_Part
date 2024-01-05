package com.signzy.ErrorHandling;

public class AuthenticationException extends RuntimeException{
    public AuthenticationException(String message)
    {
        super(message);
    }
}
