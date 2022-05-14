/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.jrjlibrary.MVC.models;

import br.edu.ifpr.jrjlibrary.MVC.entities.Book;
import java.util.ArrayList;

/**
 *
 * @author jvolima
 */
public class BookModel {
    static ArrayList<Book> books = new ArrayList();
    
    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> availableBooks = new ArrayList();
        for(Book book: books) {
            if(book.getIsBorrowed() == false) {
                availableBooks.add(book);
            }
        }
        
        return availableBooks;
    }
    
    public Book findByIndex(int index) {
        Book book = books.get(index);
        return book;
    }
    
    public void create(Book b) {
        books.add(b);
    }
    
    public void edit(int index, Book bookEdited) {   
        books.set(index, bookEdited);
    }
    
    public void delete(int index) {
        books.remove(index);
    }
    
    public void updateBorrowedBook(int index, boolean isBorrowed) {
        Book book = books.get(index);
        book.setIsBorrowed(isBorrowed);
        books.set(index, book);
    }
}
