package com.Model.Dao.MyClass.bookinfo;

import java.math.BigDecimal;
import java.sql.Date;

public class book {
    private Integer id;

    private String bookid;

    private String bookname;

    private String autor;

    private String publisher;

    private BigDecimal bookprice;

    private Date publisherdate;

    private String booktype;

    private String stacks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getBookprice() {
        return bookprice;
    }

    public void setBookprice(BigDecimal bookprice) {
        this.bookprice = bookprice;
    }

    public Date getPublisherdate() {
        java.sql.Date sqlDate = new java.sql.Date(publisherdate.getTime());
        return sqlDate;
    }

    public void setPublisherdate(Date publisherdate) {
        this.publisherdate = publisherdate;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getStacks() {
        return stacks;
    }

    public void setStacks(String stacks) {
        this.stacks = stacks;
    }
}