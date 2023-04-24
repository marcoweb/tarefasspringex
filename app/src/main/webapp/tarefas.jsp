<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Tarefas</title>
</head>
<body>
    <form action="/" method="post">
        <input type="text" name="descricao" />
        <button type="submit">Salvar</button>
    </form>
    <c:forEach var="t" items="${tarefas}">
        ${t.descricao} <br />
    </c:forEach>
</body>
</html>