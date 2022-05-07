package com.Model.Service;

import com.Model.Dao.MyClass.bookinfo.book;

import java.util.List;

public interface bookserviceinterface {
    int insertbook(book b1);
    int selectcount(String bookid);
    List<book> selectbook(String bookname);
    List<book> hudh(String bookprice);
}
