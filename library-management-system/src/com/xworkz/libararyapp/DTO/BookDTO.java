package com.xworkz.libararyapp.DTO;

import com.xworkz.libararyapp.constants.Type;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDTO {
    private int bookId;
    private String bookName;
    private Type bookType;
    private double price;
    private int yearOfPublish;
    private String authorName;
    private String publisher;
    private int noOfPages;

}
