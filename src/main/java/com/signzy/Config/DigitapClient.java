package com.signzy.Config;

import com.signzy.DTO.PAN.DigitapPanDetailsRequest;
import com.signzy.DTO.PAN.DigitapPanDetailsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "Digitap", url = "https://svc.digitap.ai/validation")
public interface DigitapClient {
    @PostMapping("/kyc/v1/pan_details")
    DigitapPanDetailsResponse panDetails(@RequestBody DigitapPanDetailsRequest panDetailsRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token);



}
