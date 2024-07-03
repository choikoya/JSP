package servlet;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import membership.MemberDAO;
import membership.MemberDTO;


public class MemberAuth extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	MemberDAO dao;
	
	@Override
	public void init() throws ServletException{
		ServletContext application = this.getServletContext();
		
		String driver = application.getInitParameter("MySQLDriver");
		String connectUrl = application.getInitParameter("MySQLURL");
		String oId = application.getInitParameter("MySQLId");
		String oPass = application.getInitParameter("MySQLPwd");
		
		dao = new MemberDAO(driver, connectUrl, oId, oPass);
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException{
		
		
		String admin_id = this.getInitParameter("admin_id");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		MemberDTO memberDTO = dao.getMemberDTO(id, pass);
		
		String memberName = memberDTO.getName();
		if(memberName != null) {
			req.setAttribute("authMessage", memberName + "회원님 웰컴");
		}
		else {
			if(admin_id.equals(id))
				req.setAttribute("authMessage", admin_id + "는 최고 관리자");
			else
				req.setAttribute("authMessage", "비회원 입니다");
		}
		req.getRequestDispatcher("/12Servlet/MemberAuth.jsp").forward(req, resp);
	
	}
	
	@Override
	public void destroy() {
		dao.close();
	}
	
		
}