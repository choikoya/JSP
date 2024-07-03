<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
		public int gcd(String num1, String num2){
			if(num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty())
				return 0;
			int a=Integer.parseInt(num1);
			int b=Integer.parseInt(num2);
			while(b!=0){
				int r=a%b;
				a=b;
				b=r;
			}
			return a;
		}
	
	public int lcm(String num1, String num2){
		if(num1 == null || num1.isEmpty() || num2 == null || num2.isEmpty())
			return 0;
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		
		return a*b / gcd(num1, num2);
	}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<%
	
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	
	
	
	%>
<body>
	


	<form>
	<table style="border:1px solid black;">
		<tr>
			<td>숫자1:</td>
<%			if (snum1 == null){ %>
				<td><input type="text" name="num1" placeholder="숫자를 입력하세요"/></td>
<%				}else { %>
				<td><input type="text" name="num1" value="<%=snum1%>" /></td>
<%				} %>		
		</tr>
		<tr>
			<td>숫자2:</td>
<%			if (snum2 == null){ %>
				<td><input type="text" name="num2" placeholder="숫자를 입력하세요"/></td>
<%				}else { %>
				<td><input type="text" name="num2" value="<%=snum2%>" /></td>
<%				} %>		
		</tr>
		<tr>
			<td>최대공약수:</td>
			<td><input type="text" name="num3" value="<%=gcd(num1, num2)%>" readonly/></td>
		</tr>
		<tr>
			<td>최소공배수:</td>
			<td><input type="text" name="num4" value="<%=1cm%>" readonly/></td>
		</tr>
		<tr>
			<td colspan="2" style="margin: 0 auto; text-align:center;">
				<input style="width:100%;" type="submit" value="실행"/>
			</td>
		
		</tr>
	</table>	
	

	</form>

</body>
</html>