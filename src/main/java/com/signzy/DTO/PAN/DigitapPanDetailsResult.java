package com.signzy.DTO.PAN;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DigitapPanDetailsResult {
    private String pan;
    private String pan_type;
    private String fullname;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String gender;
    private String dob;
    private String aadhaar_number;
    private String aadhaar_linked;
    private DigitapPanDetailsAddress address;
    private String mobile;
    private String email;

}
