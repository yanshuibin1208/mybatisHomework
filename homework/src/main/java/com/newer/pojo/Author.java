package com.newer.pojo;

import java.util.List;

public class Author {
    private int auid;
    private String name;
    private String sex;
    private String birthday;
    private String address;
    private String phone;
    private List<Article>articles;
    private List<Article_commt> commts;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article_commt> getCommts() {
        return commts;
    }

    public void setCommts(List<Article_commt> commts) {
        this.commts = commts;
    }


    public int getAuid() {
        return auid;
    }

    public void setAuid(int auid) {
        this.auid = auid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
