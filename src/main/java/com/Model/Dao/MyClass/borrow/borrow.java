package com.Model.Dao.MyClass.borrow;

import java.sql.Date;

public class borrow {
    private Integer id;

    public String getThstatus() {
        return thstatus;
    }

    public void setThstatus(String thstatus) {
        this.thstatus = thstatus;
    }

    private String studentid;

    private String name;

    private String bookid;

    private String bookname;

    private Date borrowdate;

    private Date returndate;
    private  String thstatus;
    private Date againdate;

    public Date getAgaindate() {
        return againdate;
    }

    public void setAgaindate(Date againdate) {
        this.againdate = againdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Date getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(Date borrowdate) {
        this.borrowdate = borrowdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }
}