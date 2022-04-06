package com.example.otp4.service;

import com.example.otp4.dao.OtpDaoImpl;
import com.example.otp4.request.OtpRequest;
import com.example.otp4.response.OtpResponse;
import com.example.otp4.response.Success;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtpService {
    @Autowired
    OtpDaoImpl otpDao;
    public OtpResponse save(OtpRequest otpRequest) // save otpRequest but return type is otpResponse
    {
        OtpResponse otp=new OtpResponse(); // creating object for otpResponse
        //validate
        String referenceId = otpDao.saveOtp(otpRequest);

        Success success = new Success();
        success.setReferenceId(referenceId);
        success.setMobile(true);
        success.setEmail(true);
        success.setRemarks("successful");
        success.setInvestorId(otpRequest.getInvestorId());
        success.setHolderProfileId(otpRequest.getHolderProfileId());
        //process-success
        //process-failure
        otp.setCode(200);
        otp.setDesc("success");
        otp.setSuccess(true);
        otp.setType("object");
        otp.setData(success);
        otp.setName("OtpResponse");

        return otp;
    }
}
