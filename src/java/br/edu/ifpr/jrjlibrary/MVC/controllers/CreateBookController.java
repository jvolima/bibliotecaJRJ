/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.jrjlibrary.MVC.controllers;

import br.edu.ifpr.jrjlibrary.MVC.entities.Book;
import br.edu.ifpr.jrjlibrary.MVC.models.BookModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author jvolima
 */
@WebServlet(name = "CreateBookController", urlPatterns = {"/CreateBookController"})
public class CreateBookController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int pages = Integer.parseInt(request.getParameter("pages"));
        String publishingCompany = request.getParameter("publishing_company");
        String genre = request.getParameter("genre");
        int year = Integer.parseInt(request.getParameter("year"));
        
        Book b = new Book(title, author, publishingCompany, genre, year, pages);
               
        BookModel model = new BookModel();
        
        model.create(b);
        
        response.sendRedirect("ListBooksController");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
