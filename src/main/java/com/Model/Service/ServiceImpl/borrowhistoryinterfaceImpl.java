package com.Model.Service.ServiceImpl;

import com.Model.Dao.Daointerface.borrowhistory.borrowhistoryMapper;
import com.Model.Dao.MyClass.borrowhistory.borrowhistory;
import com.Model.Service.borrowhistoryinterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class borrowhistoryinterfaceImpl implements borrowhistoryinterface {
    @Resource
    private borrowhistoryMapper historyservice;
    @Override
    public int inserthistory(borrowhistory h1) {
         return  historyservice.insertSelective(h1);
    }

    @Override
    public List<borrowhistory> fasd(String bookid, String bookname) {
        return historyservice.thdas(bookid,bookname);
    }

    @Override
    public List<borrowhistory> hggf(String studentid, String name) {
        return  historyservice.fgdso(studentid,name);
    }
}
