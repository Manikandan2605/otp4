package com.example.otp4.dao;

import com.example.otp4.request.OtpRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class OtpDaoImpl implements OtpDao {

    @Autowired

    JdbcTemplate jdbcTemplate;

    private static final String insert_User_Query="INSERT INTO otp_data.otp(referenceId, type,product,mobile,email,investorId,holderProfileId,otpUser) values(?,?,?,?,?,?,?,?)";

    @Override
    public String saveOtp(OtpRequest otpRequest) {

        String referenceId = "";
        try {

            referenceId = UUID.randomUUID().toString();
            jdbcTemplate.update(insert_User_Query, referenceId, otpRequest.getType(), otpRequest.getProduct(), otpRequest.getMobile(), otpRequest.getEmail(), otpRequest.getInvestorId(), otpRequest.getHolderProfileId(), otpRequest.getOtpUser());

        }
        catch(Exception e)
        {
            log.error("exception occurs",e);
        }

        return referenceId;
    }


}
