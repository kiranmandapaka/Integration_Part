package com.signzy.DTO.PAN;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigitapPanDetailsRequest {
    private String client_ref_num;
    private String pan;
}
