package com.example.otp4.controller;

import com.example.otp4.dao.OtpDaoImpl;
import com.example.otp4.request.OtpRequest;
import com.example.otp4.response.OtpResponse;
import com.example.otp4.service.OtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/otpend")
public class OtpController {
    @Autowired
    OtpDaoImpl otpDao;
    @Autowired
    OtpService otpService;
    @PostMapping("/")
    public ResponseEntity<OtpResponse> createOtp(@RequestBody OtpRequest otpRequest)
    {
        OtpResponse otpResponse=otpService.save(otpRequest);
        return ResponseEntity.status(otpResponse.getCode()).body(otpResponse);
    }

}
