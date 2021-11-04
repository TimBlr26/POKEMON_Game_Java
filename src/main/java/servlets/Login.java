package servlets;

import java.io.IOException;
import beans.User;
import forms.LoginForm;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import services.UserService;
import services.UserServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "login", urlPatterns = "/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getAttribute("loginForm") == null) {
			request.setAttribute("loginForm", new LoginForm());
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginForm loginForm = new LoginForm();
		loginForm.setPseudo(request.getParameter("pseudo"));
		loginForm.setPassword(request.getParameter("password"));
		loginForm.validLoginForm();
		// Gestion des erreurs
		if (loginForm.isError()) {
			request.setAttribute("loginForm", loginForm);
			doGet(request, response);
		} else {
			UserService userService = new UserServiceImpl();
			User logUser = userService.login(loginForm.getLogUser());
			if (logUser != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user", logUser);
				response.sendRedirect("home");
			} else {
				loginForm.setResult("L'identifiant ou le mot de passe est incorrect!");
				request.setAttribute("loginForm", loginForm);
				doGet(request, response);
			}
		}
	}
}