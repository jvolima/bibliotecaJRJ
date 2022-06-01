<%-- 
    Document   : editarLivro
    Created on : 11 de mai de 2022, 14:28:39
    Author     : jvolima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Itim&family=Lexend&family=Poppins&display=swap" rel="stylesheet">
        <link rel="icon" type="image/png" sizes="32x32" href="./images/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="16x16" href="./images/favicon-16x16.png">
        <link rel="stylesheet" href="./styles/global.css">
        <link rel="stylesheet" href="./styles/formEdit.css">
        <title>JRJ | Editar Livro</title>
    </head>
    <body>
        <header>
            <a href="ListBooksController" id="back"><img src="./images/arrowLeft.svg" alt="Seta apontando para a esquerda"/></a>
            <div id="fake-button"><span>Editar Livro</span></div>
        </header>
        
        <div id="containerForm">
            <form method="post" id="editBook" action="EditBookController">
                <div id="containerElipse">
                    <div></div>
                    <div id="elipse">
                        <img src="./images/book.svg" alt="Icone de adicionar livro"/>
                    </div>
                </div>
                <section>
                    <div class="containerInput">
                        <img src="./images/title.svg" alt="Icone de título"/>
                        <input placeholder="Título" value="${book.title}" type="text" name="title"/>
                    </div>
                    <div class="containerInput">
                        <img src="./images/author.svg" alt="Icone de autor"/>
                        <input placeholder="Autor" value="${book.author}"  type="text" name="author"/>
                    </div>
                    <div class="containerInputNumber">
                        <img src="./images/pages.svg" alt="Icone de Páginas"/>
                        <input placeholder="Páginas" value="${book.pages}" type="number" name="pages"/>
                    </div>
                    <div class="containerInput">
                        <img src="./images/author.svg" alt="Icone de Editora"/>
                        <input placeholder="Editora" value="${book.publishingCompany}" type="text" name="publishing_company"/>
                    </div>
                    <div class="containerInput">
                        <img src="./images/genre.svg" alt="Icone de gênero"/>
                        <input placeholder="Gênero" value="${book.genre}" type="text" name="genre"/>
                    </div>
                    <div class="containerInputNumber">
                        <img src="./images/year.svg" alt="Icone de Ano"/>
                        <input placeholder="Ano" value="${book.year}" type="number" name="year"/>
                    </div>
                    <input value="${index}" hidden name="index" />
                </section>
                <button type="submit" id="botaoEditar">Editar</button>
            </form>
        </div>
    </body>
</html>
