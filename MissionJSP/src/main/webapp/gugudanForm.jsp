<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<form action="gugudanProc.jsp" method="get">
	<table>
		<tr>
			<td><input type ="radio" name="sel" value="gugudanType1" checked>Type1</td>
			<td colspan="2"><input type = "text" name="dan" value="2">단</td>
		</tr>
		<tr>
			<td><input type ="radio" name="sel" value="gugudanType2" checked>Type2</td>
			<td><input type ="radio" name="dir" value="hor" checked>hor</td>
			<td><input type ="radio" name="dir" value="ver" checked>ver</td>
		</tr>
		<tr>
			<td><input type ="radio" name="sel" value="gugudanType5" checked>Type3</td>
			<td colspan="2"><input type = "text" name="col" value="2">열</td>
		</tr>
		<tr><td>
			<input type="submit" value="선택" ></input>
		</td></tr>
	</table>	
		
</form>



</body>
</html>