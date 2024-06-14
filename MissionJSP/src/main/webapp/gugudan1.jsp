<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<%
int dan=2;



	try{
		//?dan=2를 읽음. getParameter는 문자열로 받음 Integer.parseInt는 문자열을 숫자로 변환시켜줌
		dan=Integer.parseInt(request.getParameter("dan"));
	}
	catch(Exception e){}
	
		for(int i=1; i<10; i++){
			out.println(dan + " x " + i + " = " + (dan*i) + "<br/>");	
		}
		


%>




</body>
</html>