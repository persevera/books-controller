package com.Model.Dao.Daointerface.borrow;

import com.Model.Dao.MyClass.borrow.borrow;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;


public interface borrowMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(borrow record);

    int insertSelective( borrow record);

    borrow selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(borrow record);

    int updateByPrimaryKey(borrow record);
    int updatereturndate(@Param("studentid") String studentid);
    int selectbook(@Param("bookid") String bookid);
    int bookexit(@Param("bookid")String bookid);
    borrow selectallinfo(@Param("studentid")String studentid,@Param("bookname") String bookname);
    int selectop(@Param("studentid")String studentid,@Param("bookname")String bookname,@Param("name") String name);
    int insertstatus(@Param("thstatus") String thstatus,@Param("studentid")String studentid,@Param("bookname")String bookname);
    int againdate(@Param("studentid")String studentid,@Param("bookname")String bookname);
    int selectcountbooktype(@Param("type")String booktype,@Param("studentid")String studentid,@Param("name")String name);
    String findbooktype(@Param("bookid")String bookid);
    int deleteinfo(@Param("studentid")String studentid,@Param("bookid")String bookid);
    List<borrow>  selectborrowlist(@Param("studentid")String studentid);
    List<borrow> selectbybooknamea(@Param("bookname")String bookname);
}