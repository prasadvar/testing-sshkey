<!DOCTYPE html>
<html>
<head>
   <title>Person details</title>
</head>
<h2>Customer Form</h2>
<body>
<form action="baseclass/submitForm" method= "post"  modelAttribute="baseclass">
FirstName:<input type="text" required name="FirstName"/><br/><br/>
LastName:<input type="text" required name="LastName"/><br/><br/>
Email:<input type="text" required name="Email"/><br/><br/>
Mobile:<input type="number" required name="Mobile"><br/><br/>
gender:<input type="radio" name="Gender" value="male"> Male
       <input type="radio" name="Gender" value="female"> Female
<br/><br/>
Age:<input type="number" required name="Age"><br/><br/>
Address:<input type="text" required name="Address"/><br/><br/>
Nationality:<input type="text" required name="Nationality"/><br/><br/>
<input type="submit"/>
</body>
</html>

