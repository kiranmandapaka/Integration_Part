package com.signzy.DTO.Aadhar;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigitAadharResult {
    @JsonProperty("aadhaar_result")
    private String aadhaarResult;

    @JsonProperty("aadhaar_age_band")
    private String aadhaarAgeBand;

    @JsonProperty("aadhaar_gender")
    private String aadhaarGender;

    @JsonProperty("aadhaar_phone")
    private String aadhaarPhone;

    @JsonProperty("aadhaar_state")
    private String aadhaarState;
}
