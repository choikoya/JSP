<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 지시어 - errorPage/isErrorPage 속성</title>
</head>
<body>
	<h2>서비스 중 일시적인 오류 발생</h2>
	<p>
	<%
	String errname=(exception == null)?"noError":exception.getClass().getName();
	String Message=(exception == null)?"noMessage":exception.getClass().getName();
	%>
		오류명 : <%=errname %><br/>
		오류 메시지 : <%=Message %>
	</p>
</body>
</html>
