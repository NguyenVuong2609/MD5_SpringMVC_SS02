<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/26/2023
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table tr td{
            text-align: center;
        }
        a {
            text-decoration: none;
        }
    </style>
</head>
<body>
    <h1>Student manager</h1>
    <h2><button><a href="/student/create">Create new student</a></button></h2>
<table border="1" style="width: 100%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach items="${listStudent}" var="st">
        <tr>
            <td>${st.id}</td>
            <td><a href="/student/${st.id}">${st.name}</a></td>
            <td>${st.email}</td>
            <td>${st.address}</td>
            <td><a href="/student/update/${st.id}">Edit</a></td>
            <td><a href="/student/delete/${st.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
