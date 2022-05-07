package com.Controller;


import com.Model.Dao.MyClass.controller;
import com.Model.Service.ServiceImpl.serviceinterfaceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Map;


@Controller
public class useradd {
    @Autowired
    private serviceinterfaceImpl service;

    @RequestMapping(value = "useradd",method = RequestMethod.GET)
    public String zhuanfa(){
        return "useradd";
    }

    @RequestMapping(value = "/addstudent",method = RequestMethod.GET)
    @ResponseBody
    public String addstudent(controller stu) {
        String result = "";
        ModelAndView mo = new ModelAndView();
        int findphone = service.findphone(stu.getPhonenumber());
        if (findphone == 0) {
            service.insert(stu);
            result = "注册成功";
        } else {
            stu.setId(1);
            result = "该手机号已被注册过了";
        }
        return result;
    }

    @RequestMapping(value = "/tuichu",method = RequestMethod.GET)
    public void cjgsdiuhj(HttpServletRequest request){
        ModelAndView mo=new ModelAndView();
        HttpSession session=request.getSession(false);
        //销毁session
        if(session!=null){
            session.invalidate();
        }
        }
        @RequestMapping("index")
    public  String  sdj(){
            System.out.println("hello");
            return "index";
        }
        @RequestMapping("/more")
    public String fhs(){
        return  "more";
        }

}
