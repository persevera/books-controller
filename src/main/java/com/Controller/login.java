package com.Controller;

import com.Model.Service.ServiceImpl.serviceinterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class login {
    @Autowired
    private serviceinterfaceImpl service;


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String dologin(String phonenumber, String password,Model mo) {
        ModelAndView mu = new ModelAndView();
        int hu=service.findphone(phonenumber);
        if(hu==0){
            mo.addAttribute("errormessage","该账号不存在,请先注册");
            return "index";
        }
        int doyanzheng = service.doyanzheng(phonenumber, password);
        if (doyanzheng == 1) {
            return "success";
        }
            mo.addAttribute("errormessage","密码错误请重新输入");
           return "index";
    }
}
