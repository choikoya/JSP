<%@ page import = "common.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 영역</title>
</head>
<body>
	<h2>이동 후 page 영역의 속성값 읽기</h2>
	<%
	//pageContextMain에서 set, get했던 데이터는 페이지 넘어오면서 끊김(공유안됨)그래서 여기서 페이지 출력하면 get값이 null값임
	Object pInteger = pageContext.getAttribute("pageInteger");
	Object pString = pageContext.getAttribute("pageString");
	Object pPerson = pageContext.getAttribute("pagePerson");
	%>
	<ul>
		<li>Integer 객체 : <%= (pInteger == null) ? "값 없음" : pInteger %></li>
		<li>String 객체 : <%= (pString == null) ? "값 없음" : pString %></li>
		<li>Person 객체 : <%= (pPerson == null) ? "값 없음" : ((Person)pPerson).getName() %></li>
	</ul>
</body>
</html>