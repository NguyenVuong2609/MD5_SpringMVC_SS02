<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/26/2023
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Your sandwich</h1>
<ul>
<c:forEach items="${condiment}" var="cdm">
    <li>${cdm}</li>
</c:forEach>
</ul>

</body>
</html>
