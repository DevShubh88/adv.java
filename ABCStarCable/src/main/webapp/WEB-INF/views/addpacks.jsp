<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="insertemployee" method="post">
       Customer No : <input type="text" name="custno" id="custno"><br>
       Base pack : <input type="text" name="basepack" id="basepack"><br>
       Optional Pack: <input type="text" name="optionalpack" id="optionalpack"><br>
      
       <button type="submit" name="btn" id="btn">Add new Packs</button>
   </form>
</body>
</html>