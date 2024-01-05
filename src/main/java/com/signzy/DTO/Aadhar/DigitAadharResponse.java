package com.signzy.DTO.Aadhar;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DigitAadharResponse {
    @JsonProperty("http_response_code")
    private int httpResponseCode;

    @JsonProperty("client_ref_num")
    private String clientRefNum;

    @JsonProperty("request_id")
    private String requestId;

    @JsonProperty("result_code")
    private int resultCode;

    @JsonProperty("result")
    private DigitAadharResult result;
}
