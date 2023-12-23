<%@page import="java.util.List"%>
<%@page import="com.user.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>

<div class="container"></div>



<table class="table">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">name</th>
      <th scope="col">email</th>
      <th scope="col">password</th>
      <th scope="col">country</th>
     <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  
<%    List<User> users =  (List<User>)request.getAttribute("userlist"); %>


<% for(User u : users){
	%>
	<tr>
	   <th><%= u.getId() %></th>
      <td><%= u.getName() %></td>
      <td><%= u.getEmail() %></td>
      <td><%= u.getPassword() %></td>
      <td><%= u.getCountry() %></td>
      <td><a href="updateform.jsp?id=<%= u %>" class="btn btn-primary">Update</a>&nbsp
      	<a href="deleteservlet?id=<%=u.getId() %>" class="btn btn-primary">Delete</a>
      </td>
    </tr>
	<%
}
	%>

  </tbody>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous">

</body>
</html>