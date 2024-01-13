package com.zerocode.Book_Managing_System.service;
import com.zerocode.Book_Managing_System.dto.request.BookRequest;
import com.zerocode.Book_Managing_System.dto.response.BookResponse;
import com.zerocode.Book_Managing_System.model.Book;

import java.util.List;

public interface BookService {

    List <BookResponse> returnAllBooks();
    BookResponse addBook(BookRequest bookRequest);
    BookResponse removeBook(Long bookId);
    BookResponse updateBook(BookRequest bookRequest, Long bookId);

}
