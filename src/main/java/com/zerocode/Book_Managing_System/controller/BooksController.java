package com.zerocode.Book_Managing_System.controller;


import com.zerocode.Book_Managing_System.dto.request.BookRequest;
import com.zerocode.Book_Managing_System.dto.response.BookResponse;
import com.zerocode.Book_Managing_System.model.Book;
import com.zerocode.Book_Managing_System.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class BooksController {
    private BookService bookService;

    @PostMapping(value = "/books" , headers = "Version=v1")
    public BookResponse saveBook(@RequestBody BookRequest bookRequest){
        return bookService.addBook(bookRequest);
    }

    @GetMapping(value = "/books" , headers = "Version=v1")
    public List<BookResponse> getAllBooks(){
        return bookService.returnAllBooks();
    }

    @PutMapping(value = "/books/{bookId}" , headers = "Version=v1")
    public BookResponse updateBook(@RequestBody BookRequest bookRequest, @PathVariable Long bookId){
        return bookService.updateBook(bookRequest,bookId);
    }

    @DeleteMapping(value = "/books/{bookId}" , headers = "Version=v1")
    public BookResponse deleteBook(@PathVariable Long bookId){
        return bookService.removeBook(bookId);
    }

}
