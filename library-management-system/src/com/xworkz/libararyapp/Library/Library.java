package com.xworkz.libararyapp.Library;

import com.xworkz.libararyapp.DTO.BookDTO;
import com.xworkz.libararyapp.constants.Type;

public interface Library {

    public boolean addBooks(BookDTO dto);
    public void getAllBooks();
    public BookDTO getBookById(int id);
    public BookDTO[] getBookByYear(int yearOfPublish);
    public BookDTO[] getBookByAuthor(String authorName);
    public BookDTO getBookByPublisher(String publisher);
    public String getBookByBookType(Type bookType);
    public double getBookPriceByBookName(String bookName);
    public String getBookNameByYearOfPublish(int yearOfPublish);
    public boolean deleteBookById(int id);
    public boolean updateBookPagesByBookName(String existingBookName, int updatedPages);
    public boolean updatePublisherByAuthor(String existingAuthor,String updatedPublisher);
    public boolean updateBookPriceByBookId(int existingId, double updatedPrice);
}
