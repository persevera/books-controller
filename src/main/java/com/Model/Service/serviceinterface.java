package com.Model.Service;


import com.Model.Dao.MyClass.borrow.borrow;
import com.Model.Dao.MyClass.controller;

import java.util.List;

public interface serviceinterface {
    int insert(controller c1);
    controller selectbyphone(String phonenumber);
     int doyanzheng(String phonenumber, String password);
     int findphone(String phonenumber);

}
