<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addStudent">
	Add Student<br>
	Id: <input type="text" name="sid"><br>
	Name: <input type="text" name="sname"><br>
	Degree: <input type="text" name="sdegree"><br>
	<input type="submit"><br><br>
</form>

<form action="getStudent">
	Get Student<br>
	Id: <input type="text" name="sid"><br>
	<input type="submit"><br><br>
</form>


<form action="deleteStudent">
	Delete Student<br>
	Id: <input type="text" name="sid"><br>
	<input type="submit"><br><br>
</form>


<form action="updateStudent">
	Update Student<br>
	Id: <input type="text" name="sid"><br>
	Name: <input type="text" name="sname"><br>
	Degree: <input type="text" name="sdegree"><br>
	<input type="submit"><br>
</form>
</body>
</html>