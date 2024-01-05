package com.signzy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.signzy.DTO.*;
import com.signzy.DTO.Aadhar.VerifyAadharResponseBody;
import com.signzy.DTO.DecentroCreditReport.*;
import com.signzy.DTO.Email.EmailRequest;
import com.signzy.DTO.Email.EmailResponse;
import com.signzy.DTO.GSTIN.GSTINRequest;
import com.signzy.DTO.GSTIN.GSTINResponse;
import com.signzy.DTO.PAN.DigitapPanDetailsRequest;
import com.signzy.DTO.PAN.DigitapPanDetailsResponse;
import com.signzy.DTO.PAN.SignzyPanRequest;
import com.signzy.DTO.PAN.SignzyPanResponse;
import com.signzy.DTO.PanAdharLinked.PanAadharRequest;
import com.signzy.DTO.PanAdharLinked.PanAadharResponseBody;
import com.signzy.ErrorHandling.InvalidRequestException;
import com.signzy.service.SignzyService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class SignzyController {
    private final SignzyService signzyService;

    public SignzyController(SignzyService signzyService) {
        this.signzyService = signzyService;
    }


    @PostMapping("/authentication")
    public AuthenticationResponse createAuthentication(@RequestBody AuthenticationRequest authenticationRequest) {

        return signzyService.loginAuthentication(authenticationRequest);
    }

    @PostMapping("/identities")
    public IdentitiesResponse createIdentities(@RequestBody IdentitiesRequest identitiesRequest) {
        return signzyService.createIdentities(identitiesRequest);
    }

    @PostMapping("/panaadhar")
    public PanAadharResponseBody linkedStatus(@RequestBody PanAadharRequest requestDto) {
            return signzyService.panAadharLinked(requestDto);

    }

    @PostMapping("/aadhar")
    public ResponseEntity<?> verifyAadhar(@RequestBody SignzyRequestMap requestMap) {

            VerifyAadharResponseBody response = signzyService.verifyAadhar(requestMap);
            if (response == null) {
                throw new InvalidRequestException("Aadhar Response is null.");
            }
            return ResponseEntity.ok().body(response);
    }

    @PostMapping("/gstin")
    public GSTINResponse VerifyGstin(@RequestBody GSTINRequest gstinRequest)
    {
        return signzyService.gstinCheck(gstinRequest);
    }
    @PostMapping("/email")
    public EmailResponse VerifyGstin(@RequestBody EmailRequest emailRequest)
    {
        return signzyService.emailValidation(emailRequest);
    }
    @PostMapping("/creditReport")
    public ResponseEntity<?> decentroCreditReport(@RequestBody DecentroRequest decentroRequest) {
        try {
            DecentroResponse response = signzyService.decentroCredit(decentroRequest);

            ModelMapper modelMapper = new ModelMapper();

             if (response.getData().getCCRResponse().getCIRReportDataLst().get(0).getError() != null) {
                DecentroMapperResponse errorResponse = new DecentroMapperResponse();
                errorResponse.setStatus(response.getStatus());
                errorResponse.setMessage(response.getData().getCCRResponse().getCIRReportDataLst().get(0).getError().getErrorDesc());
                errorResponse.setDecentroTxnId(response.getDecentroTxnId());
                errorResponse.setResponseCode(response.getResponseCode());
                errorResponse.setResponseKey(response.getResponseKey());

                return ResponseEntity.ok(errorResponse);
            }

            DecentroMapperResponse response1 = modelMapper.map(response, DecentroMapperResponse.class);
            DecentroMapData decentroMapData = modelMapper.map(response.getData(), DecentroMapData.class);

            DecentroMapIDAndContactInfo idAndContactInfo = modelMapper.map(response.getData().getCCRResponse().getCIRReportDataLst().get(0).getCIRReportData().getIDAndContactInfo(), DecentroMapIDAndContactInfo.class);
            DecentroMapPersonalInfo mapPersonalInfo = modelMapper.map(response.getData().getCCRResponse().getCIRReportDataLst().get(0).getCIRReportData().getIDAndContactInfo().getPersonalInfo(), DecentroMapPersonalInfo.class);
            idAndContactInfo.setPersonalInfo(mapPersonalInfo);

            List<DecentroMapAddressInfo> mapAddressInfo = response.getData().getCCRResponse().getCIRReportDataLst().get(0).getCIRReportData().getIDAndContactInfo().getAddressInfo().stream()
                    .map(data -> modelMapper.map(data, DecentroMapAddressInfo.class))
                    .collect(Collectors.toList());
            idAndContactInfo.setAddressInfo(mapAddressInfo);

            DecentroMapScoreDetails scoreDetails = modelMapper.map(response.getData().getCCRResponse().getCIRReportDataLst().get(0).getCIRReportData().getScoreDetails().get(0), DecentroMapScoreDetails.class);
            String responseKey = response.getResponseKey();

            decentroMapData.setIdAndContactInfo(idAndContactInfo);
            decentroMapData.setScoreDetails(scoreDetails);
            response1.setData(decentroMapData);
            response1.setResponseKey(responseKey);

            return ResponseEntity.ok(response1);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid request: " + e.getMessage());
        }

    }

    @PostMapping("/pan")
    public SignzyPanResponse panValidation(@RequestBody SignzyPanRequest panRequest ) throws JsonProcessingException {
        return signzyService.panValidation(panRequest);
    }
    @PostMapping("/panDetails")
    public ResponseEntity<?> panDetails(@RequestBody DigitapPanDetailsRequest panDetailsRequest)
    {
        try {
            DigitapPanDetailsResponse response = signzyService.digitapPan(panDetailsRequest);
            return ResponseEntity.ok(response);
        }catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invaild Input : "+ e.getMessage());
        }
    }
}
