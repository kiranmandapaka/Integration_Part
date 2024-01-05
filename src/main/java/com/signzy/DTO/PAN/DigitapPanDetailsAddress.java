package com.signzy.DTO.PAN;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigitapPanDetailsAddress {
    private String building_name;
    private String locality;
    private String street_name;
    private String pincode;
    private String city;
    private String state;
    private String country;

}