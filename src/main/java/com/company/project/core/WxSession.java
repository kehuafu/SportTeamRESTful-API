package com.company.project.core;

public class WxSession {
    //用户id
    private Long id;
    //开放id 登录标识
    private String openId;

    public WxSession() {
    }

    public WxSession(Long id, String openId) {
        this.id = id;
        this.openId = openId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
