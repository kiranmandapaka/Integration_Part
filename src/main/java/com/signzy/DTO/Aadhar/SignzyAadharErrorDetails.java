package com.signzy.DTO.Aadhar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignzyAadharErrorDetails {
    private int statusCode;
    private String name;
    private String message;
    private int status;
}
