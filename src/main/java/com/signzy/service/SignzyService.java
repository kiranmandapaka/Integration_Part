package com.signzy.service;

import com.signzy.Config.DecentroClient;
import com.signzy.Config.DigitapClient;
import com.signzy.Config.SignzyClient;
import com.signzy.DTO.*;
import com.signzy.DTO.Aadhar.VerifyAadharRequest;
import com.signzy.DTO.Aadhar.VerifyAadharResponseBody;
import com.signzy.DTO.DecentroCreditReport.DecentroRequest;
import com.signzy.DTO.DecentroCreditReport.DecentroResponse;
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
import com.signzy.utill.CommonVariables;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.signzy.utill.CommonVariables.panAuth;

@Service
public class SignzyService {


    private  SignzyClient signzyClient;
    private  DecentroClient decentroClient;
    private DigitapClient digitapClient;

    public SignzyService(SignzyClient signzyClient,DecentroClient decentroClient,DigitapClient digitapClient)
    {
        this.signzyClient = signzyClient;
        this.decentroClient = decentroClient;
        this.digitapClient = digitapClient;
    }

    public AuthenticationResponse loginAuthentication(AuthenticationRequest authenticationRequest) {
        return signzyClient.createAuthentication(authenticationRequest);
    }

    public IdentitiesResponse createIdentities(IdentitiesRequest identitiesRequest) {
        return signzyClient.createIdentities(identitiesRequest,CommonVariables.identitiesAuth);
    }
    public VerifyAadharResponseBody verifyAadhar(SignzyRequestMap requestMap)
    {
        VerifyAadharRequest verify = new VerifyAadharRequest();
        Essentials essentials = new Essentials();
        essentials.setUid(requestMap.getAadharNumber());
        verify.setEssentials(essentials);
        verify.setService(CommonVariables.Service);
        verify.setTask(CommonVariables.Aadhar_task);
        verify.setAccessToken(CommonVariables.Aadhar_AccessToken);
        verify.setItemId(CommonVariables.Aadhar_ItemId);

        return signzyClient.verifyAadhar(verify);
    }

//    public VerifyAadharResponseBody verifyAadhar(KycRequestDTO verifyAadharRequest)
//    {
//        VerifyAadharRequest verifyAadharRequest1 = new VerifyAadharRequest();
//        Essentials essentials = new Essentials();
//        essentials.setUid(verifyAadharRequest.getDocNumber());
//        verifyAadharRequest1.setEssentials(essentials);
//        verifyAadharRequest1.setService(CommonVariables.Service);
//        verifyAadharRequest1.setTask(CommonVariables.Aadhar_task);
//        verifyAadharRequest1.setAccessToken(CommonVariables.Aadhar_AccessToken);
//        verifyAadharRequest1.setItemId(CommonVariables.Aadhar_ItemId);
//        return signzyClient.verifyAadhar(verifyAadharRequest1);
//    }

    public PanAadharResponseBody panAadharLinked(PanAadharRequest panAadhar) {

        panAadhar.setService(CommonVariables.Service);
        panAadhar.setItemId(CommonVariables.PanAadhar_ItemId);
        panAadhar.setTask(CommonVariables.PanAadhar_task);
        panAadhar.setAccessToken(CommonVariables.PanAadhar_AccessToken);
        return signzyClient.linkedStatus(panAadhar);
    }
    public EmailResponse emailValidation(EmailRequest emailRequest)
    {
        return signzyClient.VerifyEmail(emailRequest, CommonVariables.emailAuth);
    }
    public DecentroResponse decentroCredit(DecentroRequest decentroRequest) {
        decentroRequest.setReference_id(UUID.randomUUID().toString());
        decentroRequest.setConsent(CommonVariables.Decentro_consent);
        decentroRequest.setConsent_purpose(CommonVariables.Decentro_ConsentPurpose);
        decentroRequest.setInquiry_purpose(CommonVariables.Decentro_Inquiry_Purpose);
        return decentroClient.decentroCreditReport(decentroRequest, CommonVariables.CLIENT_ID,CommonVariables.CLIENT_SECRET,CommonVariables.MODULE_SECRET,CommonVariables.PROVIDER_SECRET);
    }
    public GSTINResponse gstinCheck(GSTINRequest requestDTO)
    {
        return signzyClient.VerifyGstin(requestDTO,CommonVariables.gstinAuth);
    }
    public SignzyPanResponse panValidation(SignzyPanRequest panRequest)
    {
        panRequest.setTask("fetch");
        return signzyClient.signzyPan(panRequest,panAuth);
    }


    public DigitapPanDetailsResponse digitapPan(DigitapPanDetailsRequest panDetailsRequest)
    {
        return digitapClient.panDetails(panDetailsRequest,CommonVariables.Digitap_Authorization);
    }
}

