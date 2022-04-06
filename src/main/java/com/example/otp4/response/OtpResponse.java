package com.example.otp4.response;

import lombok.Data;

@Data
public class OtpResponse { //it contain whole response value(success,error)
    private int code;
    private String desc;
    private boolean success;
    private String type;
    private Object data;// it contain success class
    private String name;
}

