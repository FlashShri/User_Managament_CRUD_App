
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>

 <div class="container">
 
 <%--
	 <%   User user =  (User) request.getParameter("u"); %>

--%>
	 
	
	 
	 <%   int id =  Integer.parseInt( request.getParameter("id"));%>
	
	
	<form action="UpdatedSer" method="post">
	
	 <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label"></label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="id" value="<%= id%>" aria-describedby="emailHelp">
   
  </div>
	 <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="name" aria-describedby="emailHelp" >
   
  </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email add</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
   
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
  </div>
   <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Country</label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="country" aria-describedby="emailHelp">
   
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous">
</body>
</html>