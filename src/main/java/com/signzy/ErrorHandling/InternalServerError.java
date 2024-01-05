package com.signzy.ErrorHandling;

public class InternalServerError extends RuntimeException{
    public InternalServerError(String message)
    {
        super(message);
    }
}
