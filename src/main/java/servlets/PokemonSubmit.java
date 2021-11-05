package servlets;

import java.io.IOException;

import forms.PokemonForm;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PokemonSubmit
 */
@WebServlet("/pokemon")
public class PokemonSubmit extends HttpServlet {

		private static final long serialVersionUID = 1L;

	    /**
	     * Default constructor. 
	     */
	    public PokemonSubmit() {
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// Initialisation du form la première fois
					
					if (request.getAttribute("pokemonForm") == null) {
						request.setAttribute("pokemonForm", new PokemonForm());
						
					}
			
					
			this.getServletContext().getRequestDispatcher("/WEB-INF/pokemon.jsp").forward(request, response);
		}


		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//-----Variables
			PokemonForm pokemonForm = new PokemonForm();
			
			
			//Récupération des infos
			String nickName = request.getParameter("nickName");
			int typePoke = Integer.parseInt(request.getParameter("typePoke"));

			
			// Gestion nickname
			pokemonForm.setNickName(nickName);
			pokemonForm.setTypePoke(typePoke);
							
			doGet(request, response);
			
		}
		
}

