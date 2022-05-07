package com.Controller;

import com.Model.Dao.MyClass.borrow.borrow;
import com.Model.Service.ServiceImpl.borrowinterfaceImpl;
import com.Model.utils.dodate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.sql.Date;


@Controller
public class borrowagain {

    @Autowired
    private borrowinterfaceImpl otherservice;

    dodate datecao=new dodate();
    Date returndate=null;

    @RequestMapping("/borrowagain")
    public ModelAndView doagain(borrow bu, String againdate){
        ModelAndView mo=new ModelAndView();
        int selectop = otherservice.selectop(bu.getStudentid(), bu.getBookname(), bu.getName());
        if(selectop==0){
            mo.addObject("myresult","没有这条借阅信息");
        }else if(otherservice.selectall(bu.getStudentid(),bu.getBookname()).getThstatus().equals("已续借")) {
            mo.addObject("myresult", "已续借一次，不能再次续借");
        }else {
            returndate = otherservice.selectall(bu.getStudentid(),bu.getBookname()).getReturndate();
            Date thereturndate = new Date(returndate.getTime());
            java.util.Date  lpdate=datecao.getUtildate(againdate);
            if(lpdate.before(thereturndate)){
                otherservice.updateagaindate(bu.getStudentid(),bu.getBookname());
                otherservice.insertstatus("已续借",bu.getStudentid(),bu.getBookname());
                Date againdate1 = otherservice.selectall(bu.getStudentid(), bu.getBookname()).getAgaindate();
                mo.addObject("myresult","续借成功,请与"+againdate1+"前及时归还");
            }else {
                mo.addObject("myresult","还书逾期，拒绝续借");
            }
        }


        mo.setViewName("result");
        return mo;
    }
}
