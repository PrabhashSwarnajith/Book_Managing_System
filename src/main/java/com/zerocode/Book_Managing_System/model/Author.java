package com.zerocode.Book_Managing_System.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    private String authorName;

    @ManyToOne
    private Author author;

}
