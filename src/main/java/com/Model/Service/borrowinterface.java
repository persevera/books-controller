package com.Model.Service;

import com.Model.Dao.MyClass.borrow.borrow;

import java.sql.Date;
import java.util.List;

public interface borrowinterface {
    int insertborrow(borrow b1);
    int addmonth(String studentid);
    int selectbook(String bookid);
    int seleexitbook(String bookid);
    borrow selectall(String studentid,String bookname);
    int selectop(String studentid,String bookname,String name);
    int insertstatus(String thstatus,String studentid,String bookname);
    int updateagaindate(String studentid,String bookname);
    int selectcountbooktype(String booktype,String studentid,String name);
    String selectbooktype(String bookid);
    int deleteinfo(String studentid,String bookid);
    List<borrow> selectlist(String studentid);
    List<borrow> sel(String bookname);
}
