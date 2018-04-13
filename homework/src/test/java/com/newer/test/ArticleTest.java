package com.newer.test;

import com.newer.dao.ArticleMapper;
import com.newer.pojo.Article;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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
}
