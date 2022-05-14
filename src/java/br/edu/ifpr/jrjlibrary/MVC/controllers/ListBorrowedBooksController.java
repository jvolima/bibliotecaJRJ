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
import java.util.ArrayList;

/**
 *
 * @author jvolima
 */
@WebServlet(name = "ListBorrowedBooksController", urlPatterns = {"/ListBorrowedBooksController"})
public class ListBorrowedBooksController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BookModel bookModel = new BookModel();
        ArrayList<Book> books = bookModel.getBooks();
               
        request.setAttribute("books", books);
        request.getRequestDispatcher("devolverLivros.jsp").forward(request, response);
    }
}
