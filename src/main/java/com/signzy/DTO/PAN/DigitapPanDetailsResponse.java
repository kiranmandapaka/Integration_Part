package com.signzy.DTO.PAN;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DigitapPanDetailsResponse {
    private String http_response_code;
    private String result_code;
    private String request_id;
    private String client_ref_num;
    private String message;
    private DigitapPanDetailsResult result;

}
