package servlets;

import java.io.IOException;
import java.util.List;

import beans.Capacity;
import beans.Pokemon;
import forms.PokemonForm;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.PokeService;
import services.PokeServiceImpl;

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
			
			if(request.getSession().getAttribute("typePoke")!= null) {
				int typePoke = (int) request.getSession().getAttribute("typePoke");
				//int typePoke = Integer.parseInt(request.getParameter("typePoke"));
				System.out.println("test1" + typePoke);
				
				
				PokeService capService = new PokeServiceImpl();
				List<Capacity> capacityList = capService.findByTypeCap(typePoke);
	
				request.setAttribute("capacityList", capacityList);
			}		
			this.getServletContext().getRequestDispatcher("/WEB-INF/pokemon.jsp").forward(request, response);
		}


		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//-----Variables
			PokemonForm pokemonForm = new PokemonForm();
			PokeService pokeService = new PokeServiceImpl();
			
			
			//Récupération des infos
			String nickName = request.getParameter("nickname");
			int typePoke = Integer.parseInt(request.getParameter("typePoke"));

			
			// Gestion nickname
			pokemonForm.setNickName(nickName);
			pokemonForm.setTypePoke(typePoke);
			request.getSession().setAttribute("typePoke", typePoke);
			//Gestion des capacity
			List<Capacity> capacityList = pokeService.findByTypeCap(1);
			//Capacity choosenCapacity = pokeService.findByTypeCap();
			request.getSession().setAttribute("capacityList", capacityList);
			// Gestion des erreurs
			if (pokemonForm.isError() || request.getSession().getAttribute("typePoke")== null) {
				request.setAttribute("inscriptionForm", pokemonForm);
				doGet(request, response);
			} else {
				//Création user
				Pokemon newPokemon = new Pokemon(nickName, pokemonForm.getpV(), pokemonForm.getAttack(), pokemonForm.getDefence(), pokemonForm.getSpeed(), typePoke, pokemonForm.getCapacity());
				pokeService.create(newPokemon);
				response.sendRedirect("pokemon");
			}
			
		}
		
}

