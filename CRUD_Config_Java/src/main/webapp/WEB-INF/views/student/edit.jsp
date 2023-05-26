<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/26/2023
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update/${student.id}" method="post">
    <table border="1" style="width: 100%">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th colspan="2">Action</th>
        </tr>
        <tr>
            <td>
                <input type="text" value="${student.id}" disabled>
            </td>
            <td>
                <input type="text" value="${student.name}" name="name">
            </td>
            <td>
                <input type="email" value="${student.email}" name="email">
            </td>
            <td>
                <input type="text" value="${student.address}" name="address">
            </td>

        </tr>
    </table>
    <button type="submit">Update</button>
</form>
</body>
</html>
