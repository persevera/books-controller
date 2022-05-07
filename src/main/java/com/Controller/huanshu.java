package com.Controller;

import com.Model.Dao.MyClass.borrowhistory.borrowhistory;
import com.Model.Service.ServiceImpl.borrowhistoryinterfaceImpl;
import com.Model.Service.ServiceImpl.borrowinterfaceImpl;
import com.Model.utils.dodate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;

@Controller
public class huanshu {
  @Autowired
  private borrowhistoryinterfaceImpl historyservice;

  @Autowired
          private borrowinterfaceImpl myservice;
  dodate getut=new dodate();
    @RequestMapping(value = "/returnthebook",method = RequestMethod.GET)
    public ModelAndView tohuanshu(borrowhistory hu,String returndate){
     Date borrowDate= myservice.selectall(hu.getStudentid(),hu.getBookname()).getBorrowdate();
      ModelAndView mo=new ModelAndView();
      String thstatus = myservice.selectall(hu.getStudentid(), hu.getBookname()).getThstatus();
      if(thstatus.equals("未续借")){
        Date returndate1 = myservice.selectall(hu.getStudentid(),hu.getBookname()).getReturndate();
        Date thereturndate = new Date(returndate1.getTime());
        java.util.Date  lpdate=getut.getUtildate(returndate);
        if(lpdate.before(thereturndate)){
          hu.setReturndate(getut.getsqldate(returndate));
          hu.setBorrowdate(borrowDate);
          historyservice.inserthistory(hu);
          myservice.deleteinfo(hu.getStudentid(),hu.getBookid());
          mo.addObject("myresult","还书成功");
        }else{
          long l = (lpdate.getTime() - thereturndate.getTime())/24/60/60/1000;

          double v = l * 0.2;
          mo.addObject("myresult","还书逾期"+l+"天,罚款:"+v);
          hu.setReturndate(getut.getsqldate(returndate));
          hu.setBorrowdate(borrowDate);
          historyservice.inserthistory(hu);
          myservice.deleteinfo(hu.getStudentid(),hu.getBookid());
        }
      }else {
        Date returndate2 = myservice.selectall(hu.getStudentid(),hu.getBookname()).getAgaindate();
        Date thereturndate2 = new Date(returndate2.getTime());
        java.util.Date  lpdate=getut.getUtildate(returndate);
        if(lpdate.before(thereturndate2)){
          hu.setReturndate(getut.getsqldate(returndate));
          hu.setBorrowdate(borrowDate);
          historyservice.inserthistory(hu);
          myservice.deleteinfo(hu.getStudentid(),hu.getBookid());
          mo.addObject("myresult","还书成功");
        }else {
          long l = (lpdate.getTime() - thereturndate2.getTime())/24/60/60/1000;
          double v = l * 0.2;
          mo.addObject("myresult","还书逾期"+l+"天,罚款:"+v);
          hu.setReturndate(getut.getsqldate(returndate));
          hu.setBorrowdate(myservice.selectall(hu.getStudentid(),hu.getBookname()).getBorrowdate());
          historyservice.inserthistory(hu);
          myservice.deleteinfo(hu.getStudentid(),hu.getBookid());
        }
      }
    mo.setViewName("result");
      return  mo;
      }
    }
