package com.Controller;

import com.Model.Dao.MyClass.bookinfo.book;
import com.Model.Service.ServiceImpl.bookserviceinterfaceImpl;
import com.Model.utils.dodate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class bookcontroller {
    dodate thdate=new dodate();
    @Autowired
    private bookserviceinterfaceImpl service;

    @RequestMapping(value = "/addbooks", method = RequestMethod.GET)
    public ModelAndView addstudnet(book mybook, String publisherdate) {
        ModelAndView mo=new ModelAndView();
        mybook.setPublisherdate(thdate.getsqldate(publisherdate));
        int selectcount = service.selectcount(mybook.getBookid());
        if (selectcount>0) {
            mo.addObject("myresult","该书已经录入过了");
        }else {
            service.insertbook(mybook);
            mo.addObject("myresult","录入成功");
            int result2=service.selectcount(mybook.getBookid());
            if(result2==0){
                mo.addObject("myresult","录入失败");
            }
        }
        mo.setViewName("result");
        return  mo;
    }

    @RequestMapping("/book")
    public  String zhunhuan(){
        return "book";
    }
}

