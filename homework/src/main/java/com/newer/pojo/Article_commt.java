package com.newer.pojo;

import java.sql.Date;

public class Article_commt {
    private Integer id;
    private String commt;
    private Date commt_time;
    private Article article;
    private Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommt() {
        return commt;
    }

    public void setCommt(String commt) {
        this.commt = commt;
    }

    public Date getCommt_time() {
        return commt_time;
    }

    public void setCommt_time(Date commt_time) {
        this.commt_time = commt_time;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
