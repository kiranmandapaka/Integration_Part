package com.signzy.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignzyError {
    private int statusCode;
    private String name;
    private String message;
    private int status;
}
