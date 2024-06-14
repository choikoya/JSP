<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
public int add(int num1, int num2){
	return num1 + num2;	
}
public int multi(int num1, int num2){
	return num1 * num2;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
</head>
<body>
<%
int add_result = add(10, 20);
%>
덧셈 결과 1: <%= add_result %><br/>
덧셈 결과 2: <%= add(30,40) %><br/><br/>
<%
int multi_result = multi(10, 20);
%>
곱셈 결과 1: <%= multi_result %><br/>
곱셈 결과 2: <%= multi(30,40) %><br/>
</body>
</html>