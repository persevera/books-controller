package com.Model.Service.ServiceImpl;

import com.Model.Dao.Daointerface.controllerMapper;
import com.Model.Dao.MyClass.controller;
import com.Model.Service.serviceinterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class serviceinterfaceImpl implements serviceinterface {

    @Resource
    private controllerMapper dao;

    @Override
    public int insert(controller c1) {
        return dao.insert(c1);
    }

    @Override
    public controller selectbyphone(String phonenumber) {
        return null;
    }


    @Override
    public int doyanzheng(String phonenumber, String password) {
      return dao.ifexit(phonenumber,password);
    }

    @Override
    public int findphone(String phonenumber) {
        return dao.selectphone(phonenumber);
    }


}
