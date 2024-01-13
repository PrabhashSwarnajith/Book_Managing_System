package com.zerocode.Book_Managing_System.service.impl;


import com.zerocode.Book_Managing_System.model.Author;
import com.zerocode.Book_Managing_System.repository.AuthorRepository;
import com.zerocode.Book_Managing_System.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public List<Author> returnAuthors() {
        System.out.println(" All Authors ");
         return authorRepository.findAll();
    }

    @Override
    public Author addAuthors(Author author) {
        System.out.println(" Add New Author ");
        return authorRepository.save(author);
    }

    @Override
    public void removeAuthor(Long authorId) {
        System.out.println(" Delete Author " + authorId );
        authorRepository.deleteById(authorId);
    }
}
