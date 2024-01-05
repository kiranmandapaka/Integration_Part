package com.signzy.DTO.GSTIN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.signzy.DTO.Essentials;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GSTINResponse {
    public String task;
    public Essentials essentials;
    private String id;
    private String patronId;
    private GSTINResult result;
}
