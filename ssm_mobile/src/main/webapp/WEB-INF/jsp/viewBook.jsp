<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	isbn:${book.isbn}<br/>
	bookName:${book.bookName}<br/>
	price:${book.price}<br/>
	
	${sessionScope.userName}<br/>
	${sessionScope.book}<br/>
</body>
</html>