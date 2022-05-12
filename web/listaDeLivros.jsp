<%-- 
    Document   : listaDeLivros
    Created on : 10 de mai de 2022, 19:15:56
    Author     : jvolima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Itim&family=Lexend&family=Poppins&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./styles/global.css">
        <link rel="stylesheet" href="./styles/listaUsuarios.css">
        <link rel="stylesheet" href="./styles/tabelas.css">
        <title>JRJ | Livros</title>
    </head>
    <body>
        <header>
            <a href="index.html" id="back"><img src="./images/arrowLeft.svg" alt="Seta apontando para a esquerda"/></a>
            <div id="fake-button"><span>Exibir Livros</span></div>
        </header>
        
        <div id="container">
            <div id="containerButton">
                <div></div>
                <a href="cadastroLivros.html" id="add-user">
                    <img src="./images/book.svg" alt="Livro" />
                    <span>Cadastrar Livros</span>
                </a>
            </div>
            <div id="containerTable">
                <table>
                    <tr>
                        <th>Título</th>
                        <th>Gênero</th>
                        <th>Páginas</th>
                        <th>Ano</th>
                        <th>Autor</th>
                        <th>Editora</th>
                    </tr>
                    <tr></tr>
                    <c:forEach var="book" items="${books}">
                        <tr>
                            <td>${book.title}</td>
                            <td>${book.genre}</td>
                            <td>${book.pages}</td>
                            <td>${book.year}</td>
                            <td>${book.author}</td>
                            <td>${book.publishingCompany}</td>
                            <td class="editCell">
                                <a href="EditBookController?title=${book.title}&author=${book.author}" class="edit">
                                    <img src="./images/edit.svg" alt="Editar" />
                                </a>
                            </td>
                            <td class="deleteCell">
                                <a href="DeleteBookController?title=${book.title}&author=${book.author}" class="delete">
                                    <img src="./images/trash.svg" alt="Remover" />
                                </a>
                            </td>
                        </tr>
                    </c:forEach>    
                </table>
            </div>
        </div>
    </body>
</html>
