package com.newer.test;

import com.newer.dao.ArticleMapper;
import com.newer.pojo.Article;
import com.newer.pojo.Author;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArticleTest {
    @Test
    public void findAll(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        ArticleMapper articleMapper=sqlSession.getMapper(ArticleMapper.class);
        List<Article>list=articleMapper.findAll();
        list.forEach((Article article)->{
            System.out.println(article.getTitle()+":"+article.getArticleAuthor().getName());
        });
        sqlSession.close();
    }

    @Test
    public void findAll2(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        ArticleMapper articleMapper=sqlSession.getMapper(ArticleMapper.class);
        List<Article>list=articleMapper.findAll2();
        list.forEach((Article article)->{
            System.out.println(article.getTitle()+":"+article.getArticleAuthor().getName());
           System.out.println("评论数："+article.getCommts().size());
        });
        sqlSession.close();
    }

    @Test
    public void findAdv(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        ArticleMapper dao=sqlSession.getMapper(ArticleMapper.class);
        Map<String,Object>map=new HashMap<>();
        //map.put("title","%静%");
//        map.put("begintime", Date.valueOf("1960-01-01"));
//        map.put("endTime",Date.valueOf("2013-01-01"));
        Author author=new Author();
        author.setAuid(1);
        map.put("order","publishTime");
        map.put("articleAuthor",author);
        map.put("pageNo",1);
        map.put("pageSize",2);
        List<Article>list=dao.findAdv(map);
        for (Article article:list){
            System.out.println(article.getArid()+":"+article.getTitle());
        }
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}
