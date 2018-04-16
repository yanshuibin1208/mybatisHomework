package com.newer.dao;

import com.newer.pojo.Article;

import java.util.List;
import java.util.Map;

public interface ArticleMapper {
    List<Article> findAll();

    List<Article> findAll2();

    List<Article>findAdv(Map<String,Object>map);
}
