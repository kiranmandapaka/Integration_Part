package com.signzy.DTO.PAN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.signzy.DTO.Essentials;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignzyPanResponse {
    private Essentials essentials;
    private String id;
    private String patronId;
    private String task;
    private SignzyPanResult result;
}
