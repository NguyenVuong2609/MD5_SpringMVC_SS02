<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/25/2023
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
  table {
    border: 1px solid #000;
  }
  th, td {
    border: 1px dotted #555;
  }
</style>

<table>
  <caption>Students List</caption>
  <thead>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="st" items="${requestScope.students}">
    <tr>
      <td>
        <c:out value="${st.id}"/>
      </td>
      <td>
        <a href="detail/${st.id}">${st.name}</a>
      </td>
      <td>
        <c:out value="${st.email}"/>
      </td>
      <td>
        <c:out value="${st.address}"/>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
