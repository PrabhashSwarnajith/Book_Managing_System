package com.zerocode.Book_Managing_System.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private String bookName;
    private Integer bookPrice;
    private String bookAuthor;
    private  String massage;
}
