package com.pdl.controller;

import com.pdl.domain.Account;
import com.pdl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.POST;
import java.io.IOException;
import java.util.Date;

@Controller("accountController")
@RequestMapping("/account")
public class UserController {
    //添加账户演示
//    @RequestMapping(path = "/addUser",method = RequestMethod.POST)
//    public String addUser(Account account){
//        System.out.println("方法运行了"+account);
//        return "success";
//    }
    //模拟查询账户信息
//    @RequestMapping("query")
//    public String queryUser(){
//        System.out.println("账户信息");
//        return "success";
//    }
    //获取请求,响应,session
//    @RequestMapping("query")
//    public String queryUser(HttpServletRequest request, HttpServletResponse response, HttpSession session){
//        System.out.println(request+","+response+","+session);
//        System.out.println("账户信息");
//        return "success";
//    }
//    //请求转发
//    @RequestMapping("forwardTest")
//    public void forwardTest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("请求转发");
//        request.getRequestDispatcher("/success.jsp").forward(request,response);
//    }
//    //重定向
//    @RequestMapping("sendTest")
//    public void sendTest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("重定向");
//        response.sendRedirect(request.getContextPath()+"/success2.jsp");
//    }
    //关键词forward转发
//    @RequestMapping("forwardTest")
//    public String forwardTest() {
//        System.out.println("请求转发");
//        return "forward:/success.jsp";
//    }
//    //关键词redirect重定向
//    @RequestMapping("sendTest")
//    public String sendTest() {
//        System.out.println("重定向");
//        return"redirect:query";
//    }
    //异步请求
//    @RequestMapping("/ajaxtest")
//    public @ResponseBody User ajaxTest(@RequestBody User user){
//        System.out.println("异步请求");
//        user.setName("小花");
//        user.setSex("女");
//        user.setBirthday(new Date());
//        System.out.println(user);
//        return user;
//    }
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(String a,Object c){
        System.out.println("执行了");
        ModelAndView mv = new ModelAndView();
        mv.addObject("d","aa");
        //设置返回路径
        mv.setViewName("success");
        return mv;
    }
}
