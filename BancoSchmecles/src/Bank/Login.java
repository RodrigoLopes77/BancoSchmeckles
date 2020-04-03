package Bank;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		if(email.equals("rodrigo.lopes@gmail.com") && senha.equals("12345") ){
			HttpSession sessao= request.getSession();
			sessao.setAttribute("email", email);
			sessao.setAttribute("email", email);
			response.sendRedirect("Home.do");
			
		}
		else if(email.equals("") || senha.equals("")){
			response.getWriter().print("preencha algo  antes de seguir");}
		
		
		else {
			response.getWriter().println("Verifique se seus dados foram inseridos, volte pra home clicando no link ao lado");
			response.getWriter().println("<a href=\"http://localhost:8080/BancoSchmecles/Login.html\"><button>Refazer Login</button></a>");
		}
	}

}