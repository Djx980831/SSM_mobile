<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="90%" align="certen" border="1">
		<tr>
			<td>isbn</td>
			<td>书名</td>
			<td>价格</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${list}" var="l">
			<tr>
			<td>${l.isbn}</td>
			<td>${l.bookName}</td>
			<td>${l.price}</td>
			<td></td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="addBook">增加图书</a>
</body>
</html>