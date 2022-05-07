package com.Model.Dao.Daointerface;

import com.Model.Dao.MyClass.controller;
import org.apache.ibatis.annotations.Param;

public interface controllerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(controller record);

    int insertSelective(controller record);

    controller selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(controller record);

    int updateByPrimaryKey(controller record);
    int ifexit(@Param("phone")String phonenumber,@Param("mima") String password);
    int selectphone(@Param("phone") String phonenumber);
}