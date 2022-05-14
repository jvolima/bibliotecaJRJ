/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.jrjlibrary.MVC.entities;

/**
 *
 * @author jvolima
 */
public class Book {
    private String title;
    private String author;
    private String publishingCompany;
    private String genre;
    private int year;
    private int pages;
    private boolean isBorrowed;
    
    public Book(String title, String author, String publishingCompany, String genre, int year, int pages) {
        this.title = title;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.genre = genre;
        this.year = year;
        this.pages = pages;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public boolean getIsBorrowed() {
        return isBorrowed;
    }
    
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    } 
}
