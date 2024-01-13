package com.zerocode.Book_Managing_System.service.impl;

import com.zerocode.Book_Managing_System.dto.request.BookRequest;
import com.zerocode.Book_Managing_System.dto.response.BookResponse;
import com.zerocode.Book_Managing_System.model.Book;
import com.zerocode.Book_Managing_System.repository.BooksRepository;
import com.zerocode.Book_Managing_System.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private BooksRepository booksRepository;


    @Override
    public List<BookResponse> returnAllBooks() {

        List<Book> books = booksRepository.findAll();
        List<BookResponse> bookList = new ArrayList<>();

        bookList.add(books);

        System.out.println(" Get All Book ");
        return bookList;
    }

    @Override
    public BookResponse addBook(BookRequest bookRequest) {
        Book response = new Book();

        response.setBookName(book.getBookName());
        response.setBookPrice(book.getBookPrice());

        System.out.println(" Add Book ");

        return booksRepository.save(response);
    }

    @Override
    public BookResponse removeBook(Long bookId) {
        System.out.println(" Delete book " + bookId);
        booksRepository.deleteById(bookId);
        return new Book();
    }


    @Override
    public BookResponse updateBook(BookRequest bookRequest, Long bookId) {

         booksRepository.findById(bookId)
                .map(book1 -> {
                    book1.setBookName(book.getBookName());
                    book1.setBookPrice(book.getBookPrice());
                    System.out.println(" Update Book "+ bookId);
                    return booksRepository.save(book1);
                });
        return null;
    }
}




