package com.newer.dao;

import com.newer.pojo.Article;

import java.util.List;

public interface ArticleMapper {
    List<Article> findAll();
}
