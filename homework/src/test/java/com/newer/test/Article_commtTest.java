package com.newer.test;

import com.newer.dao.Article_commtMapper;
import com.newer.pojo.Article_commt;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Article_commtTest {

    @Test
    public void findAll(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        Article_commtMapper dao=sqlSession.getMapper(Article_commtMapper.class);
        List<Article_commt>list=dao.findAll();
        list.forEach((Article_commt act)->{
            System.out.println(act.getId()+":"+act.getCommt()+" 评论者id:"+act.getAu_id()+" 评论者name:"+act.getAuthor().getName()+" 文章name:"+act.getArticle().getTitle()+" 文章作者name:"+act.getArticle().getArticleAuthor().getName()+" 文章作者id:"+act.getArticle().getArticleAuthor().getAuid());
        });
    }
}
