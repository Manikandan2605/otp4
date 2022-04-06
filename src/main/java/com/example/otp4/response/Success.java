package com.example.otp4.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Success {
    public String referenceId;
    public boolean mobile;
    public boolean email;
    public String remarks;
    public String investorId;
    public String holderProfileId;
}
