package com.zerocode.Book_Managing_System.service;

import com.zerocode.Book_Managing_System.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> returnAuthors();
    Author addAuthors(Author author);
    void removeAuthor(Long authorId);


}
