<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/26/2023
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    input {
      width: 100%;
    }
  </style>
</head>
<body>
<form action="/create" method="post">
  <table border="1" style="width: 100%">
    <tr>
      <th>Name</th>
      <th>Email</th>
      <th>Address</th>
    </tr>
    <tr>
      <td>
        <input type="text" name="name">
      </td>
      <td>
        <input type="email" name="email">
      </td>
      <td>
        <input type="text" name="address">
      </td>
    </tr>
  </table>
  <button type="submit">Create</button>
</form>
</body>
</html>
