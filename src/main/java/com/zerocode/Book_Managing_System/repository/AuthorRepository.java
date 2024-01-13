package com.zerocode.Book_Managing_System.repository;

import com.zerocode.Book_Managing_System.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
