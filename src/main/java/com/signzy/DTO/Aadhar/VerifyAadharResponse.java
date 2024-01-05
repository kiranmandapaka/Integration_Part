package com.signzy.DTO.Aadhar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifyAadharResponse {
    private String id;
    private VerifyAadharResult result;
}
