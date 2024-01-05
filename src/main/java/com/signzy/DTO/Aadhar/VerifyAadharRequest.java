package com.signzy.DTO.Aadhar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.signzy.DTO.Essentials;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerifyAadharRequest {
    private  String service;
    private String itemId;
    private String accessToken;
    private String task;
    private Essentials essentials;
}
