<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="common.JDBConnect" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 목록 조회 테스트(executeQuery() 사용)</h2>
	<%
	
	JDBConnect jdbc = new JDBConnect();
	
	
	PreparedStatement ps = jdbc.getCon().prepareStatement("SELECT num, title, content, id, postdate, visitcount FROM board where id=?");
	ps.setString(1, "musthave");
	
	//
	//String sql = "SELECT num, title, content, id, postdate, visitcount FROM board where id=?";
	//Connection conn = jdbc.getCon();
	//PreparedStatement psmt = conn.prepareStatement(sql);

	
	
	ResultSet rs = ps.executeQuery();
	
	
	while(rs.next()){
		String num = rs.getString("num"); 
		String title = rs.getString("title");
		String content = rs.getString("content");
		String id = rs.getString("id");
		String postdate = rs.getString("postdate");
		String visitcount = rs.getString("visitcount");
		
		
		
		
		out.println(String.format("%s %s %s %s %s %s", num, title, content, id, postdate, visitcount)+"<br/>");
		}
		
		jdbc.close();
		%>
</body>
</html>