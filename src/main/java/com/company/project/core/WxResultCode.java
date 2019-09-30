package com.company.project.core;

public enum WxResultCode {
    SUCCESS("success" ,0),

    FAIL("fail",1),

    UNAUTHORIZED("unauthorized",2);

    //TODO 待扩展状态字段

    private int code;

    private String message;

    private WxResultCode(String message , int code){
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
