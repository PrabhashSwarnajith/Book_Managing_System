package com.zerocode.Book_Managing_System.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    private String bookName;
    private Integer bookPrice;
    private String bookAuthor;
}
