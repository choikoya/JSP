
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 영역</title>
</head>
<body>
	<h2>페이지 이동 후 session 영역의 속성 읽기</h2>
	<%
	ArrayList<String> lists = (ArrayList<String>)session.getAttribute("lists"); //session 영역에서 속성 읽어온 후 형변환
	for (String str : lists) //for문 이용해 컬렉션에서 객체들을 꺼내 출력
		out.print(str + "<br/>");
	%>
</body>
</html>