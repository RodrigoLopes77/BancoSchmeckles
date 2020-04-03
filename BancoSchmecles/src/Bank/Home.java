package Bank;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Home.do")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sessao= request.getSession();  
        
        if(sessao != null){  
            String usuario =(String)sessao.getAttribute("email"); 
            response.getWriter().println("<a href= 'Logoff.do'><button>Logoff</button></a>");
            response.getWriter().println("Olá, " + usuario + " Seja bem vindo");
            }  
            else{  
            	response.getWriter().println("Por gentileza faça o Login antes");  
            	response.getWriter().println("<a href='Login.html'><button>Refazer Login</button></a>");  
            }  
        
        response.getWriter().close();  
    }}

