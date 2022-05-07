package com.Model.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class dodate {
    SimpleDateFormat format = null;
    java.util.Date d = null;
    java.sql.Date date=null;
    java.util.Date utildate=null;
    public Date getsqldate(String key){
        format=new SimpleDateFormat("yyyy-MM-dd");
        try {
            d=format.parse(key);
             date = new java.sql.Date(d.getTime());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date;
    }
    //字符串转util.Date
    public java.util.Date  getUtildate(String key){
        format=new SimpleDateFormat("yyyy-MM-dd");
        try {
            d=format.parse(key);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }
}
