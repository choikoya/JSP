package utils;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.JspWriter;



public class JSFunction {
	
	//메시지 알림창을 띄운 후 명시한 URL로 이동
	public static void alertLocation(HttpServletResponse resp, String msg, String url, JspWriter out) {
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			String script=""
					+ "<script>"
					+ "	alert('"+msg+"');"
					+ " location.href='" + url + "';"
					+ "</script>";
			out.println(script);
		}
		catch(Exception e) {}
	}
	
	//메시지 알림창을 띄운 후 이전 페이지로 돌아감
	public static void alertBack(HttpServletResponse resp, String msg, JspWriter out) {
		try {
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			String script=""
					+ "<script>"
					+ "	alert('" + msg + "');"
					+ "	history.back();"
					+ "</script>";
			out.println(script);
		}
		catch(Exception e) {}
	}
	

}
