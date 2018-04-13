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
            System.out.println(act.getId()+":"+act.getCommt()+":"+act.getAu_id()+":"+act.getArticle().getTitle()+":"+act.getAuthor().getName());
        });
    }
}
