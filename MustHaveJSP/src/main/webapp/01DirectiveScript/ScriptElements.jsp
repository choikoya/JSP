<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!//선언부(메서드코드)
public int add(int num1, int num2){
	return num1 + num2;	
}
public int minus(int num1, int num2){
	return num2 - num1;
}
public int multi(int num1, int num2){
	return num1 * num2;
}
public int divide(int num1, int num2){
	return num2 / num1;
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
</head>
<body>
<% //스크립틀릿(자바코드)
int add_result;
int minus_result;
int multi_result;
int divide_result;

try{
	int num1=Integer.parseInt(request.getParameter("num1"));
	int num2=Integer.parseInt(request.getParameter("num2"));
	
	add_result = add(num1, num2);
	minus_result = minus(num1, num2);
	multi_result = multi(num1, num2);
	divide_result = divide(num1, num2);
} catch(Exception e){
	add_result = 0;
	minus_result = 0;
	multi_result = 0;
	divide_result = 0;
}

%><br/>

덧셈 결과 1: <%= add_result %><br/>
곱셈 결과 2: <%= multi_result %><br/>
뺄셈 결과 3: <%= minus_result %><br/>
나눗셈 결과 4: <%= divide_result %><br/>
</body>
</html>