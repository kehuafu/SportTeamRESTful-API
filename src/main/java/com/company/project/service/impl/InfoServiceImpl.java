package com.company.project.service.impl;

import com.company.project.dao.InfoMapper;
import com.company.project.model.Info;
import com.company.project.service.InfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/10/07.
 */
@Service
@Transactional
public class InfoServiceImpl extends AbstractService<Info> implements InfoService {
    @Resource
    private InfoMapper infoMapper;

}
