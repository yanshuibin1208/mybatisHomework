package com.newer.pojo;

import java.sql.Date;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date publish_time;
    private Author articleAuthor;

    public Author getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(Author articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
