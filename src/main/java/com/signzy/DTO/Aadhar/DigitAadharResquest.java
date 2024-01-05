package com.signzy.DTO.Aadhar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigitAadharResquest {
    private String client_ref_num;
    private String aadhaar;
}
