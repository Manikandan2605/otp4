package com.example.otp4.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OtpRequest {
    public String type;
    public String product;
    public String mobile;
    public String email;
    public String investorId;
    public String holderProfileId;
    public String otpUser;
}
