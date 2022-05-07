package com.Model.Dao.Daointerface.bookinterface;

import com.Model.Dao.MyClass.bookinfo.book;
import com.Model.Dao.MyClass.borrow.borrow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bookMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(book record);

    int insertSelective(book record);

    book selectByPrimaryKey(@Param("id")Integer id);

    int updateByPrimaryKeySelective(book record);

    int updateByPrimaryKey(book record);

    int selectcount(@Param("bookid") String bookid);
     List<book>  selectlike(@Param("bookname") String bookname);
     List<book>  selectbookprice(@Param("bookprice") String bookprice);
}