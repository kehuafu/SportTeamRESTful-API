package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Order;
import com.company.project.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping("addOrder")
    @ResponseBody
    public List<Order> addOrder(HttpServletRequest request, Model model) throws ParseException {
        Order order = new Order();
        List<Order> list = orderService.getAll();
        int id = Integer.parseInt(request.getParameter("id"));
        String weiXinId = request.getParameter("weixinId");
        String weiXin2Id = request.getParameter("weixin2Id");
        int state = Integer.parseInt(request.getParameter("orderState"));
        String myTeam = request.getParameter("myTeamName");
        String team2 = request.getParameter("teamName");
        String timeTmp = request.getParameter("time");
        Date time = new Date();
        order.setOrderId(id);
        order.setWeiXinId(weiXinId);
        order.setWeiXin2Id(weiXin2Id);
        order.setOrderState(state);
        order.setMyTeamName(myTeam);
        order.setTeamName(team2);
        order.setTime(timeTmp);
        list.add(order);
        return list;
    }
    @RequestMapping("show")
    public String toIndex(HttpServletRequest request,Model model) {
        //int userId=Integer.parseInt(request.getParameter("id"));
        //OrderEntity order=this.userService.getUserById(userId);
        //model.addAttribute("user",user);
        return "showUser";
    }
}
