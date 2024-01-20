<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="/ABCStarCable/packs/updatepacks" method="post">
       Customer No : <input type="text" name="custno" id="custno" value="${e.custno}" readonly><br>
       Base pack : <input type="text" name="basepack" id="basepack" value="${e.basepack}"><br>
        Optional Pack: <input type="text" name="optionalpack" id="optionalpack" value="${e.optionalpack}"><br>
         
         <button type="submit" name="btn" id="btn">update Packs</button>
   </form>
</body>
</html>