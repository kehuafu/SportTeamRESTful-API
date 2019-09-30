package com.company.project.model;

public class WxUser {
    //用户id
    private Long id;
    //手机号
    private String mobile;
    //用户编号
    private String userNo;
    //开放id
    private String openId;
    //微信授权加密key
    private String sessionKey;
    //同一商户下唯一id
    private String unionId;
    //登录时间
    private String loginTime;

    public WxUser() {

    }
    public WxUser(String mobile,String userNo,String openId,String sessionKey,String unionId,String loginTime) {
        this.mobile=mobile;
        this.userNo=userNo;
        this.openId=openId;
        this.sessionKey=sessionKey;
        this.unionId=unionId;
        this.loginTime=loginTime;
    }

    public String getOpenId() {
        return openId;
    }
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getUnionId() {
        return unionId;
    }
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserNo() {
        return userNo;
    }
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
