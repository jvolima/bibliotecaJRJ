<%-- 
    Document   : editarUsuario
    Created on : 10 de mai de 2022, 08:59:50
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
        <link rel="stylesheet" href="./styles/global.css">
        <link rel="stylesheet" href="./styles/formEdit.css">
        <title>JRJ | Editar Usuário</title>
    </head>
    <body>
        <header>
            <a href="ListUsersController" id="back"><img src="./images/arrowLeft.svg" alt="Seta apontando para a esquerda"/></a>
            <div id="fake-button"><span>Editar Usuário</span></div>
        </header>
        
        <div id="containerForm">
            <form method="post" action="EditUserController">
                <div id="containerElipse">
                    <div></div>
                    <div id="elipse">
                        <img src="./images/user.svg" alt="Icone de adicionar usuário"/>
                    </div>
                </div>
                <section>
                    <div class="containerInput">
                        <img src="./images/nome.svg" alt="Icone de usuário"/>
                        <input placeholder="Nome" value="${user.name}" type="text" name="name"/>
                    </div>
                    <div class="containerInput">
                        <img src="./images/mail.svg" alt="Icone de email"/>
                        <input placeholder="E-Mail" value="${user.email}" type="text" name="email"/>
                    </div>
                    <div class="containerInput">
                        <img src="./images/senha.svg" alt="Icone de cadeado"/>
                        <input placeholder="Senha" value="${user.password}" type="text" name="password"/>
                    </div>
                    <div class="containerInputNumber">
                        <img src="./images/idade.svg" alt="Icone de idade"/>
                        <input placeholder="Idade" value="${user.age}" type="number" name="age"/>
                    </div>
                    <div class="containerInput">
                        <img src="./images/curso.svg" alt="Icone de curso"/>
                        <input placeholder="Curso" value="${user.course}" type="text" name="course"/>
                    </div>
                  
                    <input value="${user.email}" name="oldEmail" style="display:none"/>
                    <input value="${user.password}" name="oldPassword" style="display:none"/>
                </section>
                <button type="submit" id="botaoEditar">Editar</button>
            </form>
        </div>
    </body>
</html>
