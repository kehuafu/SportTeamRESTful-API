package com.conpany.project;

import java.io.Console;
import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.company.project.model.Order;
import com.company.project.service.impl.OrderServiceImpl;
import com.company.project.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
public class TestMyBatis {
    //private ApplicationContext ac=null;
    @Resource
    private OrderService orderService=null;
    //@Before
    //public void Before() {
    //	ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    //	userService=(IUserService)ac.getBean("userService");
    //}
    @Test
    public void test1() throws ParseException {
        String str=this.orderService.getTimeById(1);
        //List<OrderEntity> orders=this.orderService.getAll();
        //logger.info(JSON.toJSON(order));
        //System.out.println(timestamp);
        //System.out.println(JSON.toJSON(orders));
        System.out.println(JSON.toJSON(str));
    }
}
