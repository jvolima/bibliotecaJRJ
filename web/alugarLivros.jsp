<%-- 
    Document   : alugarLivros
    Created on : 13 de mai de 2022, 20:27:59
    Author     : jvolima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JRJ | Alugar livros</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Itim&family=Lexend&family=Poppins&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./styles/global.css">
        <link rel="stylesheet" href="./styles/alugar.css"/>
    </head>
    <body>
        <header>
            <a href="ListBooksController" id="back"><img src="./images/arrowLeft.svg" alt="Seta apontando para a esquerda"/></a>
            <div id="fake-button"><span>Alugar Livros</span></div>
        </header>
        
        <div id="containerForm">
            <form method="post" action="CreateBookController">
                <div id="containerElipse">
                    <div></div>
                    <div id="elipse">
                        <img src="./images/alugarLivro.svg" alt="Icone de adicionar livro"/>
                    </div>
                </div>
                <section>
                    <div class="containerSelect">
                        <img src="./images/nome.svg" alt="Icone de usuario"/>
                        <select>
                            <option class="options" value="" disabled selected>Selecione um Usuário</option>
                        </select>
                    </div>
                    <div class="containerSelect">
                        <img src="./images/bookAluguel.svg" alt="Icone de usuario"/>
                        <select id="selectBooks">
                            <option class="options" value="" disabled selected>Selecione um Livro</option>
                        </select>
                    </div>
                </section>
                
                <button type="submit" id="botaoAlugar">Alugar</button>
            </form>
        </div>
    </body>
</html>
