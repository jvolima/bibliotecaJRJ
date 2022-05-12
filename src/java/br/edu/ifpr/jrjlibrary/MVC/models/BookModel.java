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
    
    public void create(Book b) {
        books.add(b);
    }
    
    public Book findByTitleAndAuthor(String title, String author) {
        Book book = null;
        for(Book b: books) {
            if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
                book = b;
            }
        }
        
        return book;
    }
    
    public void edit(String title, String author, Book bookEdited) {
        Book book = findByTitleAndAuthor(title, author);
        
        int index = books.indexOf(book);
        
        books.set(index, bookEdited);
    }
    
    public void delete(String title, String author) {
        Book book = findByTitleAndAuthor(title, author);
        books.remove(book);
    }
}
