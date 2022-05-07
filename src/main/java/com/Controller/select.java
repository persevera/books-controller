package com.Controller;

import com.Model.Dao.MyClass.bookinfo.book;
import com.Model.Dao.MyClass.borrow.borrow;
import com.Model.Dao.MyClass.borrowhistory.borrowhistory;
import com.Model.Service.ServiceImpl.bookserviceinterfaceImpl;
import com.Model.Service.ServiceImpl.borrowhistoryinterfaceImpl;
import com.Model.Service.ServiceImpl.borrowinterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class select {

    @Autowired
    private borrowinterfaceImpl thservice;

    @Autowired
    private bookserviceinterfaceImpl bookservice;

    @Autowired
    private borrowhistoryinterfaceImpl  historyservice;

    @RequestMapping(value = "/selectbystudentid",method = RequestMethod.GET)
    @ResponseBody
    public List<borrow>  getborrowinfo(String studentid){

        return thservice.selectlist(studentid);
    }
    @RequestMapping(value = "/selectbybookname",method = RequestMethod.GET)
    @ResponseBody
    public List<borrow> getbooknameinfo(String bookname){
      return  thservice.sel(bookname);
    }

    @RequestMapping(value = "/selectlikename",method = RequestMethod.GET)
    @ResponseBody
    public List<book>  getthebook(String bookname){
        String thebookname="%"+bookname+"%";
        return  bookservice.selectbook(thebookname);
    }

    @RequestMapping(value = "/lphistory",method = RequestMethod.GET)
    @ResponseBody
    public List<borrowhistory> getmyhistory(String bookid,String bookname){
       return historyservice.fasd(bookid,bookname);
    }

    @RequestMapping(value = "/opstudentinfo",method = RequestMethod.GET)
    @ResponseBody
    public List<borrowhistory> getokinfo(String studentid,String name){
        return historyservice.hggf(studentid,name);
    }

    @RequestMapping("kgfdgdf")
    @ResponseBody
    public  List<book> getopop(String bookprice){
     return  bookservice.hudh(bookprice);
    }
}
