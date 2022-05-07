package com.Model.Service;

import com.Model.Dao.MyClass.borrowhistory.borrowhistory;

import java.util.List;

public interface borrowhistoryinterface {
    int inserthistory(borrowhistory h1);
    List<borrowhistory> fasd(String bookid,String bookname);
    List<borrowhistory>  hggf(String studentid,String name);
}
