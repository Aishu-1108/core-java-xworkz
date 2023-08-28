package com.xworkz.libararyapp;

import com.xworkz.libararyapp.DTO.BookDTO;
import com.xworkz.libararyapp.Library.Implementation.PublicLibraryImpl;
import com.xworkz.libararyapp.constants.Type;

import java.util.Arrays;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("The count of the books are:");
        int size = sc.nextInt();

        PublicLibraryImpl lib = new PublicLibraryImpl(size);
        for(int i=0;i<lib.books.length;i++){
            BookDTO dto = new BookDTO();

            System.out.println("Enter the book name");
            dto.setBookName(sc.next());
            System.out.println("Enter the book type");
            dto.setBookType(Type.valueOf(sc.next()));
            System.out.println("Enter the year of publish");
            dto.setYearOfPublish(sc.nextInt());
            System.out.println("Enter the publisher name");
            dto.setPublisher(sc.next());
            System.out.println("Enter the book price");
            dto.setPrice(sc.nextDouble());
            System.out.println("Enter the author name");
            dto.setAuthorName(sc.next());
            System.out.println("Enter the no of pages");
            dto.setNoOfPages(sc.nextInt());

           lib.addBooks(dto);

        }
        lib.getAllBooks();

        String userInput = null;
        do{
            System.out.println("Press 1. to get all the books details");
            System.out.println("Press 2. to fetch book name by id");
            System.out.println("Press 3. to fetch book names by year");
            System.out.println("Press 4. to fetch book name by author");
            System.out.println("Press 5. to fetch book name by publisher");
            System.out.println("Press 6. to fetch book name by book type");
            System.out.println("Press 7. to fetch book price by book name");
            System.out.println("Press 8. to fetch book name by year of publish");
            System.out.println("Press 9. to delete book by book id");
            System.out.println("Press 10. to update bookPages by book name");
            System.out.println("Press 11. to update book publisher by book author");
            System.out.println("Press 12. to update book price by book id");

            int options = sc.nextInt();
            switch (options){
                case 1: lib.getAllBooks();
                         break;
                case 2: System.out.println("Fetching book name by id");
                        BookDTO bookName = lib.getBookById(sc.nextInt());
                        System.out.println("The book name is: "+bookName);
                        break;
                case 3: System.out.println("Fetching book names by year");
                        BookDTO[] bookNames = lib.getBookByYear(sc.nextInt());
                        for(int i=0;i<bookNames.length;i++){
                            System.out.println(bookNames[i].getBookName());
                            //System.out.println(bookNames[i].getBookId());
                        }
                      //  System.out.println("The book name is: "+bookNames);
                        break;
                case 4: System.out.println("Fetching book name by author");
                        BookDTO[] name = lib.getBookByAuthor(sc.next());
                        for(int i=0;i<name.length;i++){
                        System.out.println(name[i].getBookName());
                        }
                        break;
                case 5: System.out.println("Fetching book name by publisher");
                        BookDTO name2 = lib.getBookByPublisher(sc.next());
                        System.out.println("The book names are: "+name2);
                        break;
                case 6: System.out.println("Fetching  book name by book type");
                        String name1 = lib.getBookByBookType(Type.valueOf(sc.next()));
                        System.out.println("The book name is: "+name1);
                        break;
                case 7: System.out.println("Fetching book price by book name");
                        double price = lib.getBookPriceByBookName(sc.next());
                        System.out.println("The book price is: "+price);
                        break;
                case 8: System.out.println("Fetching book name by year of publish");
                        String bookName1 = lib.getBookNameByYearOfPublish(sc.nextInt());
                        System.out.println("The book name is: "+bookName1);
                        break;
                case 9: System.out.println("Deleting book by book id");
                        boolean isDeleted = lib.deleteBookById(sc.nextInt());
                        System.out.println("Is book deleted: "+isDeleted);
                        break;
                case 10: System.out.println("Updating the publisher by author");
                    boolean isUpdated = lib.updatePublisherByAuthor(sc.next(),sc.next());
                    System.out.println("Is the price updated: "+isUpdated);
                    break;
                case 11: System.out.println("Updating book pages by book name");
                    boolean isUpdated2 = lib.updateBookPagesByBookName(sc.next(),sc.nextInt());
                    System.out.println("Is the price updated: "+isUpdated2);
                    break;
                case 12: System.out.println("Updating book price by book id");
                    boolean isUpdated3 = lib.updateBookPriceByBookId(sc.nextInt(),sc.nextDouble());
                    System.out.println("Is the price updated: "+isUpdated3);
                    break;

            }
            System.out.println("Do you want to continue: yes/no");
            userInput = sc.next();
        }while (userInput.equals("yes"));
        System.out.println("Thank you!! Visit again");

        }
    }
