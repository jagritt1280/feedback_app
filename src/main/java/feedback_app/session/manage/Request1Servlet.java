package feedback_app.session.manage;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//we have to create cookie
		String username="jagrit";
		String userId="1234";
		Cookie cookie =new Cookie("username",username);
		Cookie cookie2 =new Cookie("userid",userId);
		cookie.setMaxAge(10*60);
		cookie.setMaxAge(5*60);
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		HttpSession session=req.getSession();
		session.setAttribute("userSecret", UUID.randomUUID().toString());
		
		session.setMaxInactiveInterval(10*60);
		resp.setContentType("text/html");
		var writer=resp.getWriter();
		writer.println("<h1>Cookie set successfully</h1>");
		
		
	}
	
}
