package servlets;

import java.io.IOException;

import forms.LanguageForm;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet(
		name="home",
		urlPatterns="/")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Home() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LanguageForm languageForm = new LanguageForm();
		languageForm.setLanguage(request.getParameter("language"));
		languageForm.setPath(request.getParameter("path"));
		request.getSession().setAttribute("language", languageForm.getLanguage());
		if (languageForm.getLanguage() != null && languageForm.getPath() != null) {
			response.sendRedirect(languageForm.getPath());
		} else {
			doGet(request, response);
		}	
	}

}
