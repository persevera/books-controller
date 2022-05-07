package com.Controller;

import com.Model.Dao.MyClass.borrow.borrow;
import com.Model.Service.ServiceImpl.borrowinterfaceImpl;
import com.Model.utils.dodate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;


@Controller
public class borrowcontroller {
    dodate thdate = new dodate();
    @Autowired
    private borrowinterfaceImpl borowservice;

    @RequestMapping(value = "/addborrowd", method = RequestMethod.GET)
    public ModelAndView doborrow(borrow b1, String borrowdate) {
        ModelAndView mu = new ModelAndView();
        String number = borowservice.selectbooktype(b1.getBookid());
        int ifborrow = borowservice.selectcountbooktype(number,b1.getStudentid(),b1.getName());
        if(borowservice.seleexitbook(b1.getBookid())==1){
            mu.addObject("myresult", "这本书被借走了");
        }else if(borowservice.selectbook(b1.getBookid())==0){
            mu.addObject("myresult", "书库里没有这本书");
        }else if(number.equals("自然科学图书")&&ifborrow>=5) {
            mu.addObject("myresult", "该类别借阅已达上限");
        } else if(number.equals("社会科学图书")&&ifborrow>=3) {
            mu.addObject("myresult", "该类别借阅已达上限");
        }else if(number.equals("小说类型图书")&&ifborrow>=1) {
            mu.addObject("myresult", "该类别借阅已达上限");
        }else {
            b1.setBorrowdate(thdate.getsqldate(borrowdate));
            int insertborrow = borowservice.insertborrow(b1);
            if (insertborrow == 1){
                    borowservice.addmonth(b1.getStudentid());
                Date returndate = borowservice.selectall(b1.getStudentid(), b1.getBookname()).getReturndate();
                mu.addObject("myresult", "借阅信息录入成功,请在"+returndate+"之前归还");
                }
            }
        mu.setViewName("result");
        return mu;
    }
}
