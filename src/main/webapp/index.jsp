<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2&display=swap" rel="stylesheet">
<title>Randomize Inputs</title>

<style>

nav div a {
	font-family: 'Baloo Tammudu 2', cursive;
	color : grey;
}

.navbar-brand {
	margin-left : 7%;
	font-size : 3.5rem;
	padding-left : inherit;
}
span {
	font-weight : bold;
}

.container {
	padding-bottom : 3%;
}
</style>

</head>
<body>

  
  <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Randomize Inputs</a>
    </div>
  </nav>
  <hr>
  <br>
  
  <div class="container overflow-hidden">
  <div class="row gy-5">
    <div class="col-6">
      <div class="p-3 border bg-light">
       <a href="array.jsp">	<button class="btn btn-secondary">Array </button> </a>
       
       <p> 
       	<ul>
       	
       	<li> Enter number of test cases and upper limit on array length and array input values </li>
       	<li> Currently working for <span>INTEGER</span> values </li>
       	<li> For character array -> Generate Strings </li>
       	</ul>
        </p>
      </div> 
    </div>
    <div class="col-6">
      <div class="p-3 border bg-light">
      	<a href="string.jsp">	<button class="btn btn-success">String </button> </a>
      	<p> 
       	<ul>
       	
       	<li> Enter number of test cases and upper limit on <span>STRING</span> length  </li>
       	<li> You can add any <span>EXTRA</span> characters of your choice. </li>
       	
       	</ul>
        </p>
      </div>
    </div>
    <div class="col-6">
      <div class="p-3 border bg-light">
      	<a href="matrix.jsp">	<button class="btn btn-info">Matrix </button> </a>
      	
      	<p> 
       	<ul>
       	
       	<li> Enter number of rows and columns and upper limit on array input values </li>
       	<li> Currently working for <span>INTEGER</span> values </li>
       	<li> Character Matrix is <span>IN PROGRESS</span> </li>
       	</ul>
        </p>
      </div>
    </div>
    <div class="col-6">
      <div class="p-3 border bg-light">
      	<a href="#">	<button class="btn btn-danger">Trees </button> </a>
      	
      	<p> 
       	<ul>
       	
       	<li> Currently <span>IN PROGRESS </span></li>
       	</ul>
        </p>
      </div>
    </div>
  </div>
</div>
  
  
  


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="undefined" crossorigin="anonymous"></script>
</body>
</html>