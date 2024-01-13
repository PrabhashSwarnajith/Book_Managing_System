package com.zerocode.Book_Managing_System.repository;

import com.zerocode.Book_Managing_System.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book,Long> {
}
