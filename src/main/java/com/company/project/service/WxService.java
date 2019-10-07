package com.company.project.service;

import com.alibaba.fastjson.JSONObject;
import com.company.project.core.ReturnData;
import javax.servlet.http.HttpServletRequest;

import com.company.project.model.WxUser;
import com.company.project.core.Service;

public interface WxService extends Service<WxUser>{

    //ReturnData codeToOpenId(String code, HttpServletRequest request);

    /** openid查user */
    //WxUser selectUserByOpenId(String openId);

    /** 保存用户信息 */
    //void saveUserInfo(JSONObject userInfo);
}
