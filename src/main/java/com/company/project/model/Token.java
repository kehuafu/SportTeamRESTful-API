package com.company.project.model;

public class Token {
    private String token;
    private String openId;

    /**
     * 获取时效令牌
     *
     * @return token - 时效令牌
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置时效令牌
     *
     * @param token 时效令牌
     */
    public void setToken(String token) {
        this.token = token;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
