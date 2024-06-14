<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String sel = request.getParameter("sel");

String url;
String key;


if(sel.equals("gugudanType1")){
	url = "gugudan1.jsp";
	key="dan";
}
else if(sel.equals("gugudanType2")){
	url = "gugudan1-1.jsp";
	key="dir";
	
}	
else {
	url = "";
	key="col";
}


request.getRequestDispatcher(url+ "?" +key+ "=" + request.getParameter(key)).forward(request, response);

 %>