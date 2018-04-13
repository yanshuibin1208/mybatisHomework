package com.newer.pojo;

import java.sql.Date;
import java.util.List;

public class Article {
    private Integer arid;
    private String title;
    private String content;
    private Date publish_time;
    private Author articleAuthor;
    private List<Article_commt> commts;

    public List<Article_commt> getCommts() {
        return commts;
    }

    public void setCommts(List<Article_commt> commts) {
        this.commts = commts;
    }

    public Author getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(Author articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Integer getArid() {
        return arid;
    }

    public void setArid(Integer arid) {
        this.arid = arid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

}
