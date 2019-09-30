package com.company.project.service;

import com.alibaba.fastjson.JSONObject;
import com.company.project.core.ReturnData;
import javax.servlet.http.HttpServletRequest;
import com.company.project.model.WxUser;

public interface WxService {
    /** code换取openid */
    ReturnData codeToOpenId(String code, HttpServletRequest request);

    /** openid查user */
    WxUser selectUserByOpenId(String openId);

    /** 保存用户信息 */
    void saveUserInfo(JSONObject userInfo);
}
