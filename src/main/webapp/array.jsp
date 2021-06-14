<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" integrity="undefined" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Baloo+Tammudu+2&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Big+Shoulders+Stencil+Display&family=EB+Garamond:ital@1&display=swap" rel="stylesheet">
<title>Randomize Arrays</title>

<style>

body {
		font-size : 1.2rem;
	font-weight : bold;
}

form {
	padding-bottom : 10%;
}

nav div a {
	font-family: 'Baloo Tammudu 2', cursive;
	color : grey;
}

.navbar-brand {
	margin-left : 7%;
	font-size : 3.5rem;
	padding-left : inherit;
}

h1 {
	margin : 0 70% 0 30%;
	color : #82302a;
	font-family: 'Big Shoulders Stencil Display', cursive;
	font-family: 'EB Garamond', serif;	
}

#formDiv {
	margin : auto;
	width : 90vw;
}
</style>



</head>
<body>


<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Randomize Inputs</a>
    </div>
  </nav>


<h1>Array</h1>
<hr>

<form action="array" method="post">

<div id="formDiv">
<div class="mb-3">
  <label class="form-label">Test Cases : </label>
  <input class="form-control" type="number" name="testCases" placeholder="Number of test cases">
</div>
<div class="mb-3">
  <label class="form-label">Size of Array (Upper Limit) : </label>
  <input class="form-control" type="number" name="arraySize" placeholder="Upper limit on array length">
</div>
<div class="mb-3">
  <label class="form-label">Array Values (Upper Limit) : </label>
  <input class="form-control" type="number" name="upperNum" placeholder="Upper limit on input values">
</div>
<div class="mb-3">
  <label class="form-label">Negative : </label>
  <input type="checkbox" name="sign1">
</div>
<div class="mb-3">
  <label class="form-label">Negative and Positive : </label>
  <input type="checkbox" name="sign2">
</div>

<button type="submit" class="btn btn-success">Submit</button>
</div>

</form>

</body>
</html>