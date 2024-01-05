package com.signzy.DTO.PanAdharLinked;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.signzy.DTO.Essentials;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PanAadharRequest {
    private String service;
    private String itemId;
    private String task;
    private Essentials essentials;
    private String accessToken;
//    private String id;
//    private PanAadharResponse response;
}
