package com.newer.dao;

import com.newer.pojo.Author;

import java.util.List;

public interface AuthorDao {
    int addAuthor(Author author);

    int updateAuthor(Author author);

    int deleteAuthor(int id);

    Author findById(int id);

    List<Author> findAll();
    List<Author> findAll2();
    List<Author> findAll3();

}
