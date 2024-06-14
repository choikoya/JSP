<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 - exception</title>
</head>
<body>
<%
int status = response.getStatus();

if (status == 404){
	out.print("404 에러발생");
	out.print("<br/>파일경로 확인바람");
}
else if (status == 405){
	out.print("405 에러발생");
	out.print("<br/>요청 방식(method) 확인바람");
}
else if (status == 500){
	out.print("500 에러발생");
	out.print("<br/>소스 코드 오류 확인바람");
}
%>
</body>
</html>