package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackServlet
 */
@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(" ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String feedbackMessage=request.getParameter("feedback_message");
		//form data process
		
		//reponse dena
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<h1>feedback servlet working</h1>");
		writer.println("<h2>Your form details that you have submitted</h2><h3>Your email address is : %s</h3><h3>Phone number : %s</h3><h3>Feedback message : %s</h3>".formatted(email,phone,feedbackMessage));
		
		
	}

}
