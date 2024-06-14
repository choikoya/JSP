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
String dir= "ver";
try{
	dir = request.getParameter("dir").toString();
}
catch(Exception e){}

//dir=hor 하면 2~9단 가로로 출력
//dir=ver 하면 세로로 출력


	if(dir.equalsIgnoreCase("ver")){
		
		for(int i=2; i<10; i++){ //2~9까지의 단
			out.print(String.format("<h2>%d단</h2>", i));
			for(int j=1; j<10; j++){ //1에서 9까지의 곱셈
				out.println(i+ " x " + j + " = " + i*j + "<br/>");	
			}
			out.print("<br><br>");
		}
	}else if(dir.equalsIgnoreCase("hor")){
			for(int i=2; i<10; i++){ //1에서 9까지의 곱셈
				for(int j=1; j<10; j++){ //2~9까지의 단
					out.print(i+ " x " + j + " = " + i*j + "&emsp;" );
				}
				out.print("<br/>");
			}
			
		}
			
	
		


%>




</body>
</html>