package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Info;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper extends Mapper<Info> {
    public Info selectOrde(@Param("MyWechat")String MyWechat,@Param("State")Integer Sate);
    public Info updateOrde(@Param("OrdeID")Integer OrdeID);
}