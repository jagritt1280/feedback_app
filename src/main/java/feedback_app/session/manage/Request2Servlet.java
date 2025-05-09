package feedback_app.session.manage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet2")
public class Request2Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		var writer=resp.getWriter();
		Cookie[] cookies=req.getCookies();
		var flag=false;
		StringBuilder content = new StringBuilder();
		if(cookies !=null) {
			
			for(Cookie c:cookies) {
				String name=c.getName();
				
				if(name.equals("username")) {
					System.out.println("username : "+c.getValue());
					content.append("<h1>Welcome : %s</h1>".formatted(c.getValue()));
					flag=true;
					
				}else if(name.equals("userid")) {
					System.out.println("userid : "+c.getValue());
					content.append("<h1>UserId : %s</h1>".formatted(c.getValue()));
					flag=true;
				}
			}
		}
		
		HttpSession session = req.getSession();
		String secret=(String)session.getAttribute("userSecret");
		content.append("<h1>Session Scret : %s</h1>".formatted(secret));
		if(!flag) {
			writer.println("<h1>No username found in cookies</h1>");
			writer.println("<h1>Username cookie is not there in request</h1>");
		}
		else {
			writer.println("<h1>User is present</h1>");
			writer.println(content);
		}
		
	}
	
}
