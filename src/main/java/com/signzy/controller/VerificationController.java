//package com.signzy.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//public class VerificationController {
//    @Autowired
//    private SignzyService signzyService;
//
//    @PostMapping("/pan")
//    public ResponseEntity<PanResultMap> getPanNumber1(@RequestBody IDSearchRequestDTO panRequestDTO) {
//        // use open feign to call the KYC service
//        // pass the PAN number as a request body
//        PanResponse response = signzyService.panValidation(panRequestDTO);
//
//        PanResultMap mapped = new PanResultMap();
//
//        mapped.setFirstName(response.getResult().getFirstName());
//        mapped.setMiddleName(response.getResult().getMiddleName());
//        mapped.setLastName(response.getResult().getLastName());
//        mapped.setPanNumber(response.getResult().getNumber());
//        mapped.setNameOnTheCard(response.getResult().getName());
//        mapped.setLastUpdate(response.getResult().getLastUpdatedOn());
//        mapped.setStatus(response.getResult().getPanStatus());
//        mapped.setStatusDescription(response.getResult().getPanStatus());
//        mapped.setPanHolderStatusType(response.getResult().isIndividual());
//        System.out.println(response.getResult().getPanStatus());
//
//        if ( response == null) {
//            throw new InvalidRequestException("Pan Response is null.");
//        }else return ResponseEntity.ok(mapped);
//    }
//    @PostMapping("/aadhar")
//    public ResponseEntity<VerifyAadharResponseBody> verifyAadhar(@RequestBody KycRequestDTO verifyAadharRequest) {
//        VerifyAadharResponseBody response = signzyService.verifyAadhar(verifyAadharRequest);
//        if (response == null) {
//            throw new InvalidRequestException("Aadhar Response is null.");
//        }
//        return ResponseEntity.ok().body(response);
//    }
//
//    @PostMapping("/pan/aadhar")
//    public ResponseEntity<PanAadharResponseBody> linkedStatus(@Valid @RequestBody PanAadharRequestDTO requestDto) {
//        PanAadharResponseBody response = signzyService.panAadharLinked(requestDto);
//        if (response == null) {
//            throw new InvalidRequestException("Pan Aadhar Linked Status Response is null.");
//        }
//        return ResponseEntity.ok().body(response);
//
//    }
//    @PostMapping("/email")
//    public ResponseEntity<EmailResponse> emailVerification(@RequestBody EmailRequestDTO emailRequest)
//    {
//        EmailResponse response = signzyService.emailValidation(emailRequest);
//        if(response == null)
//        {
//            throw new InvalidRequestException("Email Response is Null.");
//        }
//        return ResponseEntity.ok().body(response);
//    }
//    @PostMapping("/credit/report")
//    public ResponseEntity<DecentroResponse> creditReport(@RequestBody DecentroRequestDTO decentroRequest)
//    {
//        DecentroResponse response = signzyService.decentroCredit(decentroRequest);
//        if(response == null)
//        {
//            throw new InvalidRequestException("Credit Response Body Null.");
//        }
//        return ResponseEntity.ok().body(response);
//    }
//}
