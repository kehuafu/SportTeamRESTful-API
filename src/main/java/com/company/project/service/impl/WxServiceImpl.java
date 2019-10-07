package com.company.project.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.company.project.core.ReturnData;
import com.company.project.model.WxUser;
import com.company.project.service.WxService;
import com.company.project.core.WXAppletUserInfo;
import com.company.project.configurer.WxConfig;
import com.company.project.dao.WxMapper;
import com.company.project.core.AbstractService;
import com.company.project.core.WxSession;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Primary
@Service
@Transactional
public class WxServiceImpl extends AbstractService<WxUser> implements WxService {
    @Resource
    private WxMapper wxMapper;
    /*private Logger logger = LoggerFactory.getLogger(WxServiceImpl.class);
    @Resource
    private WxMapper wxMapper;
    @Autowired
    private WxConfig wxConfig;

    @Override
    public ReturnData codeToOpenId(String code, HttpServletRequest request) {
        logger.info("userimp sessionkey" + request.getSession().getId());
        JSONObject result = WXAppletUserInfo.getSessionKeyOropenid(code, wxConfig);
        if (result.get("errcode") != null){
            return new ReturnData(Integer.parseInt(result.get("errcode").toString()), (String)result.get("errmsg"));
        }
        //查询openid是否已存入数据库
        WxUser user = wxMapper.selectUserByOpenId((String) result.get("openid"));
        if (user != null) {
            //不等于空说明已经存入该openid的用户 返回前台登录成功 并存入userSession
            wxMapper.updateSessionKeyByOpenId((String) result.get("openid"), (String) result.get("session_key"), request.getRemoteAddr());
            request.getSession().setAttribute("userSession", new WxSession(user.getId(), user.getOpenId()));
            logger.info("userSession" + request.getSession().getAttribute("userSession"));
            return ReturnData.isOk();
        }
        user = new WxUser();
        user.setOpenId((String) result.get("openid"));
        user.setSessionKey((String) result.get("session_key"));
        wxMapper.insertUser(user);
//        WXAppletUserInfo.getUserInfo();
        request.getSession().setAttribute("userSession", new WxSession(user.getId(), user.getOpenId()));
        return ReturnData.isOk();
    }

    @Override
    public WxUser selectUserByOpenId(String openId) {
        return wxMapper.selectUserByOpenId(openId);
    }

    @Override
    public void saveUserInfo(JSONObject userInfo) {
        WxUser user=new WxUser((String) userInfo.get("moblie"),(String) userInfo.get("userNo"),(String) userInfo.get("openId"),
                (String) userInfo.get("sessionKey"),(String) userInfo.get("unionId"),(String) userInfo.get("loginTime"));
        wxMapper.updateUserInfoById(user);
    }*/
}
