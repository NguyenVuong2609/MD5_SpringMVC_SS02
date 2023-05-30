<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/26/2023
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculate" method="post">
  <input type="number" name="firstNum" value="0">
  <input type="number" name="secondNum" value="0"> <br>
  <c:forEach items="${list}" var="item">
      <button type="submit" name="cal" value="${item.id}">${item.name}</button>
  </c:forEach>
</form>
<div>Result ${operation} : ${result}</div>
</body>
</html>
