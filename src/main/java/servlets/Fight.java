package servlets;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import beans.Pokemon;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.PokeService;
import services.PokeServiceImpl;


/**
 * Servlet implementation class Fight
 */
@WebServlet("/fight")
public class Fight extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PokeService pokeService = new PokeServiceImpl();
	Random ran = new Random();

    /**
     * Default constructor. 
     */
    public Fight() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Pokemon> pokemonList = pokeService.findAll();

		request.setAttribute("pokemonList", pokemonList);
		//System.out.println(pokemonList);
//		PokeService usersService = new PokeServiceImpl();
//		List<Pokemon> usersList = usersService.findAll();
		//System.out.println(usersList.get(1));
		//System.out.println(request.getAttribute("test1"));
//		request.setAttribute("usersList", usersList);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/fight.jsp").forward(request, response);				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pokemon> pokemonList = pokeService.findAll();
//		fightForm.setChoosenPokemon(Integer.valueOf(request.getParameter("choosenPokemon")));
//		System.out.println(fightForm);
		Pokemon choosenPokemon = pokeService.findById(Integer.valueOf(request.getParameter("choosenPokemon")));
		request.getSession().setAttribute("choosenPokemon", choosenPokemon);
		Pokemon randomIAPokemon = pokeService.findById(ran.nextInt(pokemonList.size()) +1 );
		request.getSession().setAttribute("randomIAPokemon", randomIAPokemon);
		
		
		doGet(request, response);
	}

}
