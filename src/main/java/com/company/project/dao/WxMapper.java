package com.company.project.dao;

import com.company.project.model.WxUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.math.BigDecimal;
import java.util.Date;


public interface WxMapper {
    WxUser selectUserByOpenId(@Param("openid") String openid);
    int insertUser(WxUser user);
    int updateSessionKeyByOpenId(String openid, @Param("openId") String openId, @Param("sessionKey") String sessionKey);
    int updateUserInfoById(WxUser user);
}
