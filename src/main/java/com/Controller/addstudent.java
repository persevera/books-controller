package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addstudent {
    @RequestMapping("/borrow")
    public String zhuanfa(){
        return "borrow";
    }

    @RequestMapping("/again")
    public String hfsudih(){
        return "again";
    }

    @RequestMapping("/human")
    public  String fds(){
        return  "human";
    }
    @RequestMapping("/findjie")
    public  String fhusdh(){
        return  "find";
    }
    @RequestMapping("/booking")
    public String fdjs(){
        return "booking";
    }

    @RequestMapping("/other")
    public  String fjdsd(){
        return "other";
    }

    @RequestMapping("/last")
    public String jfs(){
        return "last";
    }
}
