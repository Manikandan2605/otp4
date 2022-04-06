package com.example.otp4.dao;

import com.example.otp4.request.OtpRequest;
import org.springframework.stereotype.Service;

@Service
public interface OtpDao {
    String saveOtp(OtpRequest otpRequest);

}
