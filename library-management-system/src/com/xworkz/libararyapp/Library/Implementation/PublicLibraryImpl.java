package com.xworkz.libararyapp.Library.Implementation;

import com.xworkz.libararyapp.DTO.BookDTO;
import com.xworkz.libararyapp.Library.Library;
import com.xworkz.libararyapp.constants.Type;

import java.util.Arrays;

public class PublicLibraryImpl implements Library{
    int index;
    int id=0;

    public BookDTO books[];

    public PublicLibraryImpl(int size){
        books = new BookDTO[size];
    }

    @Override
    public boolean addBooks(BookDTO book) {
        boolean isAdded = false;

        if(book!=null){
            book.setBookId(++id);
            this.books[index++]= book;
            isAdded = true;
        }
        else {
            System.out.println("Book details are not provided");
        }
        return isAdded;
    }

    @Override
    public void getAllBooks() {
        System.out.println("Getting all the books details");
        for(int bookIndex=0;bookIndex<books.length;bookIndex++){
            System.out.println(books[bookIndex]);
        }
    }

    @Override
    public BookDTO getBookById(int id) {
        BookDTO book1 = null;
        for(int index=0;index<books.length;index++){
            if(books[index].getBookId()==id){
                book1 = books[index];
            }
        }
        return book1;
    }

    @Override
    public BookDTO[] getBookByYear(int yearOfPublish) {
        BookDTO[] book2=null;
        int newIndex=0;
        for(int index=0;index<books.length;index++){
            if(books[index].getYearOfPublish()==yearOfPublish){
               newIndex++;
            }
        }
        book2 = new BookDTO[newIndex];
        newIndex = 0;
        for(int index=0;index<books.length;index++){
            if (books[index].getYearOfPublish() == yearOfPublish) {
             book2[newIndex++]=this.books[index];
            }
        }
        return book2;
    }

    @Override
    public BookDTO[] getBookByAuthor(String authorName) {
        BookDTO[] book3 = null;
        int newIndex=0;
        for(int index=0;index<books.length;index++){
            if(books[index].getAuthorName().equals(authorName)){
               newIndex++;
            }
        }
        book3=new BookDTO[newIndex];
        newIndex = 0;
        for(int index=0;index<books.length;index++){
            if(books[index].getAuthorName().equals(authorName)){
                book3[newIndex++]=this.books[index];
            }
        }
        return book3;
    }

    @Override
    public BookDTO getBookByPublisher(String publisher) {
        BookDTO pub = null;
        for(int index=0;index<books.length;index++){
            if(books[index].getPublisher().equals(publisher)){
                pub = books[index];
            }
        }
        return pub;
    }

    @Override
    public String getBookByBookType(Type bookType) {
        String name = null;
        for(int index=0;index<books.length;index++){
            if(books[index].getBookType().equals(bookType)){
                name = books[index].getBookName();
            }
        }
        return name;
    }

    @Override
    public double getBookPriceByBookName(String bookName) {
        double price = 0;
        for(int index=0;index<books.length;index++){
            if(books[index].getBookName().equals(bookName)){
                price = books[index].getPrice();
            }
        }
        return price;
    }

    @Override
    public String[] getBookNamesByYearOfPublish(int yearOfPublish) {
        String[] name = null;
        int newIndex=0;
        for(int index=0;index<books.length;index++){
            if(books[index].getYearOfPublish()==yearOfPublish){
                newIndex++;
            }
        }
        name=new String[newIndex];
        newIndex=0;
        for(int index=0;index<books.length;index++){
            if(books[index].getYearOfPublish()==yearOfPublish){
                //name[newIndex++]=String.valueOf(this.books[index]);
                name[newIndex++]=this.books[index].getBookName();
            }
        }
        return name;
    }

    @Override
    public boolean deleteBookById(int id) {
        boolean isDeleted = false;
        int oldIndex, newIndex;
        for (oldIndex=0, newIndex = 0; oldIndex < books.length; oldIndex++){
            if (!(books[oldIndex].getBookId() == id)) {
                books[newIndex++] = this.books[oldIndex];
                isDeleted = true;
            }
        }
        books = Arrays.copyOf(books, newIndex);
        return isDeleted;
    }

    @Override
    public boolean updateBookPagesByBookName(String existingBookName, int updatedPages) {
        boolean isUpdated = false;
        for(int index=0;index<books.length;index++){
            if(existingBookName!=null && updatedPages>0){
                if(books[index].getBookName().equals(existingBookName)){
                    books[index].setNoOfPages(updatedPages);
                    isUpdated=true;
                }
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updatePublisherByAuthor(String existingAuthor, String updatedPublisher) {
        boolean isUpdated = false;
        for(int index=0;index<books.length;index++){
            if(existingAuthor!=null && updatedPublisher!=null){
                if(books[index].getAuthorName().equals(existingAuthor)){
                    books[index].setPublisher(updatedPublisher);
                }
            }
        }
        return isUpdated;
    }

    @Override
    public boolean updateBookPriceByBookId(int existingId, double updatedPrice) {
        boolean isUpdated= false;
        for(int index=0;index<books.length;index++){
            if(existingId>0 && updatedPrice>0.0){
                books[index].setPrice(updatedPrice);
            }
        }

        return isUpdated;
    }
}