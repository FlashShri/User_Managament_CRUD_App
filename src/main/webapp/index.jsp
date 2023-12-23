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


<a class="btn btn-primary" href="#" role="button">Add user</a>


<h1>Employee List</h1>
<div class="container">

<div class="row">
  <div class="col-sm-6 mb-3 mb-sm-0">    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Add User</h5>
        <a href="registeruser.jsp" class="btn btn-primary">click to add</a>
      </div>
    </div>
  </div>
  <form action="listservlet" >
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">View all users</h5>
        <button class="btn btn-primary" type="submit">view list</button>
      </div>
    </div>
  </div>
  </form>
</div>
</div>

 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>