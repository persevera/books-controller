package com.Model.Service.ServiceImpl;

import com.Model.Dao.Daointerface.borrow.borrowMapper;
import com.Model.Dao.MyClass.borrow.borrow;
import com.Model.Service.borrowinterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Service
public class borrowinterfaceImpl implements borrowinterface {
    @Resource
    private borrowMapper borrowservice;
    @Override
    public int insertborrow(borrow b1) {
        return borrowservice.insertSelective(b1);
    }

    @Override
    public int addmonth(String studentid) {
         return borrowservice.updatereturndate(studentid);
    }

    @Override
    public int selectbook(String bookid) {
       return borrowservice.selectbook(bookid);
    }



    @Override
    public int seleexitbook(String bookid) {
        return  borrowservice.bookexit(bookid);
    }

    @Override
    public borrow selectall(String studentid, String bookname) {
       return borrowservice.selectallinfo(studentid,bookname);
    }

    @Override
    public int selectop(String studentid, String bookname, String name) {
        return borrowservice.selectop(studentid,bookname,name);
    }

    @Override
    public int insertstatus(String thstatus,String studentid,String bookname) {
         return borrowservice.insertstatus(thstatus,studentid,bookname);
    }

    @Override
    public int updateagaindate(String studentid, String bookname) {
        return  borrowservice.againdate(studentid,bookname);
    }

    @Override
    public int selectcountbooktype(String booktype,String studentid,String name) {
       return borrowservice.selectcountbooktype(booktype,studentid,name);
    }

    @Override
    public String selectbooktype(String bookid) {
        return borrowservice.findbooktype(bookid);
    }

    @Override
    public int deleteinfo(String studentid, String bookid) {
        return borrowservice.deleteinfo(studentid,bookid);
    }

    @Override
    public List<borrow> selectlist(String studentid) {
       return borrowservice.selectborrowlist(studentid);
    }

    @Override
    public List<borrow> sel(String bookname) {
        return borrowservice.selectbybooknamea(bookname);
    }

}
