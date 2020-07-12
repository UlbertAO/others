<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css2?family=Playfair+Display&family=Vollkorn&display=swap" rel="stylesheet"> 
<title>Welcome Admin</title>

<style>
html {
  scroll-behavior: smooth;
}
body{
width:100%;
background-color:#fcefee;
font-family: 'Vollkorn', serif;
box-sizing:border-box;

}
a{
text-decoration:none;

}
</style>
</head>
<body>
<center>
<br><br><br><br><br>
<h1>ADD PRODUCTS</h1>
<hr style="width:15%;">
<br><br><br><br>
<form style="background-color:#c5e3f6; width:60%; height:auto;" action="addpro" method="post">
<br><br>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-4 col-form-label">Product Name</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="inputEmail3" name="pname" placeholder="Enter Product name">
    </div>
    <div class="col-sm-2">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-4 col-form-label">Product Desc</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="inputPassword3" name="pdesc" placeholder="Enter Description">
    </div>
    <div class="col-sm-2">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-4 col-form-label">Product Price</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="inputPassword3" name="price" placeholder="Enter Product price">
    </div>
    <div class="col-sm-2">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-4 col-form-label">Product Manfactured Date</label>
    <div class="col-sm-2">
      <input type="date" id="start" name="pdate"
       value="2018-07-22"
       min="2018-01-01" max="2018-12-31"  >
    </div>
    <div class="col-sm-6">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-4 col-form-label">Product Manfactured Id</label>
    <div class="col-sm-6">
      <input type="text" class="form-control" id="inputPassword3" name="manfid" placeholder="Enter Manfactured Id">
    </div>
    <div class="col-sm-2">
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm-4">
      
    </div>
    <div class="col-sm-2">
      <button type="submit" class="btn btn-primary">Save</button>
    </div>
    <div class="col-sm-2">
    <a href="./listpro">
      <button type="button" class="btn btn-danger">Cancel</button>
      </a>
    </div>
    <div class="col-sm-4">
      
    </div>
  </div>
  
  <br><br><br>
  
</form>
</center>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>