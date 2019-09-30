package com.company.project.web;

import com.alibaba.fastjson.JSONObject;
import com.company.project.core.ReturnData;
import com.company.project.model.WxUser;
import com.company.project.service.WxService;
import com.company.project.core.WXAppletUserInfo;
import com.company.project.core.WxSession;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
//@RequestMapping("/WeiXin")
public class WxController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private WxService WxService;

    /**
     * code登录
     * @param code
     * @param request
     * @return
     */
    @RequestMapping("Login")
    public ReturnData openid(@RequestParam("code") String code,
                             HttpServletRequest request){
        ReturnData returnData = WxService.codeToOpenId(code, request);
        Map data = new HashMap();
        data.put("info", request.getSession().getId());
        returnData.setData(data);
        return returnData;
    }

    /**
     * 保存用户信息
     * @param encryptedData
     * @param iv
     * @param request
     * @return
     */
    @RequestMapping("SaveUser")
    public ReturnData savaUserInfo(@RequestParam("encryptedData") String encryptedData,
                                   @RequestParam("iv") String iv,
                                   HttpServletRequest request){
        WxSession userSession = (WxSession) request.getSession().getAttribute("userSession");
        WxUser user = WxService.selectUserByOpenId(userSession.getOpenId());
        JSONObject userInfo = WXAppletUserInfo.getUserInfo(encryptedData, user.getSessionKey(), iv);
        logger.info(userInfo.toJSONString());
        WxService.saveUserInfo(userInfo);
        return new ReturnData(userInfo);
    }
}
