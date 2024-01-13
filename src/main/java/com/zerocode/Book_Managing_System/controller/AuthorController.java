package com.zerocode.Book_Managing_System.controller;

import com.zerocode.Book_Managing_System.model.Author;
import com.zerocode.Book_Managing_System.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class AuthorController {


    private AuthorService authorService;

    @PostMapping(value = "/authors" , headers = "Version=v1")
    public Author addAuthor(@RequestBody Author author){
        return authorService.addAuthors(author);
    }

    @GetMapping(value = "/authors" , headers = "Version=v1")
    public List<Author> returnAuthors(){
        return authorService.returnAuthors();
    }

    @DeleteMapping(value = "/authors/{authorId}" , headers = "Version=v1")
    public void removeAuthor(@PathVariable Long authorId){
        authorService.removeAuthor(authorId);
    }

}
