package com.company.project.dao;

import com.company.project.model.WxUser;
import org.apache.ibatis.annotations.*;
import com.company.project.core.Mapper;


public interface WxMapper extends Mapper<WxUser>{
        /*WxUser selectUserByOpenId(@Param("openid") String openid);
        int insertUser(WxUser user);
        int updateSessionKeyByOpenId(String openid, @Param("openId") String openId, @Param("sessionKey") String sessionKey);
        int updateUserInfoById(WxUser user);*/
        }
