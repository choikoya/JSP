<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 - response</title>
</head>
<body>
<%
	String id = request.getParameter("user_id");
	String pwd = request.getParameter("user_pwd");
	if(id.equalsIgnoreCase("must") && pwd.equalsIgnoreCase("1234")){
		response.sendRedirect("ResponseWelcome.jsp");//sendRedirect(로그인 성공했을때의 pg(요청과 응답이 다시 반복됨). response사용)와 포워딩 차이:둘다 pg이동
	}
	else{
		request.getRequestDispatcher("ResponseMain.jsp?loginErr=1") //로그인 안되면 서버내부에서 다른페이지로 이동(오류페이지)해서 브라우저에 전송(왕복 한번만)
			.forward(request, response); //포워딩(request사용)을 해서 이동
	}
%>

</body>
</html>