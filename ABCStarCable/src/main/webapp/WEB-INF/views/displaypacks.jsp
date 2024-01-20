<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>

<h1>ABC Cable Services</h1>
<table border="2">
  <tr >
     <th>Customer No</th>
     <th>Base Pack</th>
     <th>Optional Pack</th>
     <th>action</th>
  </tr>
  <c:forEach var="e" items="${elist}">
     <tr>
       <td>${e.custno}</td>
       <td>${e.basepack}</td>
       <td>${e.optionalpack}</td>
       <td><a href="delete/${e.custno}">delete</a>
       /
       <a href="edit/${e.custno}">edit</a></td>
     </tr>
  </c:forEach>
</table>
<a href="addpacks">Add newpacks</a>

</body>
</html>