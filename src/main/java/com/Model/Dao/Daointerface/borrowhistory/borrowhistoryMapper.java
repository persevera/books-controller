package com.Model.Dao.Daointerface.borrowhistory;

import com.Model.Dao.MyClass.borrow.borrow;
import com.Model.Dao.MyClass.borrowhistory.borrowhistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface borrowhistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(borrowhistory record);

    int insertSelective(borrowhistory record);

    borrowhistory selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(borrowhistory record);

    int updateByPrimaryKey(borrowhistory record);
    List<borrowhistory> thdas(@Param("bookid") String bookid,@Param("bookname") String bookname);
    List<borrowhistory> fgdso(@Param("studentid")String studentid,@Param("name") String name);
}