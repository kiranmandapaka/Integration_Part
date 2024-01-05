package com.signzy.Config;

import com.signzy.DTO.*;
import com.signzy.DTO.Aadhar.VerifyAadharRequest;
import com.signzy.DTO.Aadhar.VerifyAadharResponseBody;
import com.signzy.DTO.Email.EmailRequest;
import com.signzy.DTO.Email.EmailResponse;
import com.signzy.DTO.GSTIN.GSTINRequest;
import com.signzy.DTO.GSTIN.GSTINResponse;
import com.signzy.DTO.PAN.SignzyPanRequest;
import com.signzy.DTO.PAN.SignzyPanResponse;
import com.signzy.DTO.PanAdharLinked.PanAadharRequest;
import com.signzy.DTO.PanAdharLinked.PanAadharResponseBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "signzy", url = "https://signzy.tech/api/v2")
public interface SignzyClient {
    @PostMapping("/patrons/login")
    AuthenticationResponse createAuthentication(@RequestBody AuthenticationRequest authenticationRequest);

    @PostMapping("/patrons/650bb98d09e2f4003ee88ae6/identities")
    IdentitiesResponse createIdentities(@RequestBody IdentitiesRequest identitiesRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token);

    @PostMapping("/snoops")
    PanAadharResponseBody linkedStatus(@RequestBody PanAadharRequest requestDto);

    @PostMapping("/snoops")
    VerifyAadharResponseBody verifyAadhar(@RequestBody VerifyAadharRequest verifyAadharRequest);

    @PostMapping("/patrons/650bb98d09e2f4003ee88ae6/gstns")
    GSTINResponse VerifyGstin(@RequestBody GSTINRequest gstinRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token);

    @PostMapping("/patrons/650bb98d09e2f4003ee88ae6/emailvalidations")
    EmailResponse VerifyEmail(@RequestBody EmailRequest emailRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token);

    @PostMapping("/patrons/650bb98d09e2f4003ee88ae6/panv2")
    SignzyPanResponse signzyPan(SignzyPanRequest panRequest, @RequestHeader(HttpHeaders.AUTHORIZATION) String token);

}
