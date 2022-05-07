package com.Model.Service.ServiceImpl;

import com.Model.Dao.Daointerface.bookinterface.bookMapper;
import com.Model.Dao.MyClass.bookinfo.book;
import com.Model.Service.bookserviceinterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class bookserviceinterfaceImpl implements bookserviceinterface {
    @Resource
    private bookMapper bookDao;
    @Override
    public int insertbook(book b1) {
       return  bookDao.insertSelective(b1);
    }

    @Override
    public int selectcount(String bookname) {
       return  bookDao.selectcount(bookname);
    }

    @Override
    public List<book> selectbook(String bookname) {
        return bookDao.selectlike(bookname);
    }

    @Override
    public List<book> hudh(String bookprice) {
        return bookDao.selectbookprice(bookprice);
    }
}
