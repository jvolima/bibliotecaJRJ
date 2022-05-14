<%-- 
    Document   : listaDeUsuarios
    Created on : 9 de mai de 2022, 21:29:33
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
        <link rel="stylesheet" href="./styles/exibir.css">
        <link rel="stylesheet" href="./styles/tables.css">
        <title>JRJ | Usuários</title>
    </head>
    <body>
        <header>
            <a href="index.html" id="back"><img src="./images/arrowLeft.svg" alt="Seta apontando para a esquerda"/></a>
            <div id="fake-button"><span>Exibir Usuários</span></div>
        </header>
        
        <div id="container">
            <div id="containerButton">
                <div></div>
                <a href="cadastroUsuarios.html" id="add-user">
                    <img src="./images/user.svg" alt="Usuário" />
                    <span>Cadastrar Usuário</span>
                </a>
            </div>
            <div id="containerTable">
                <table>
                    <tr>
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Idade</th>
                        <th>Curso</th>
                    </tr>
                    <tr></tr>
                    <c:forEach var="user" varStatus="status" items="${users}">
                        <tr>
                            <td>${user.name}</td>
                            <td>${user.email}</td>
                            <td>${user.age}</td>
                            <td>${user.course}</td>
                            <td class="editCell">
                                <a href="EditUserController?index=${status.index}" class="edit">
                                    <img src="./images/edit.svg" alt="Editar" />
                                </a>
                            </td>
                            <td class="deleteCell">
                                <a href="DeleteUserController?index=${status.index}" class="delete">
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