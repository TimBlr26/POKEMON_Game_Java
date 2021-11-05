<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fight Page</title>
<style>
<%@include file="/ressources/styles/style.css"%>
</style>
</head>
<body>
	<div class="container">
		<c:import url="header.jsp">
			<c:param name="title" value="Fight" />
		</c:import>
<!-- 			///////////////////////////////////////////////// -->
<!-- 			///////////////////////////////////////////////// -->		
		
		<main class="fight-main">
		
		<div class="FirstRow">
			<h2>${sessionScope.name}</h2>
			<div class="FirstPke">
			<form method="Post" action="fight">
				<select name="choosenPokemon" id="choosenPokemon">
					<option disabled>Choisissez un Pokemon</option>
					<c:forEach items="${ pokemonList }" var="pokemon" varStatus="status">
						<option selected="${sessionScope.choosenPokemon.id == pokemon.id }" value=${ pokemon.id }><c:out value="${ pokemon.nickName }" />
							<c:choose>
								<c:when test="${ pokemon.typePoke == 1 }"> : Fire</c:when>
								<c:when test="${ pokemon.typePoke == 2 }"> : Water</c:when>
								<c:when test="${ pokemon.typePoke == 3 }"> : Plant</c:when>
								<c:otherwise>Autre</c:otherwise>
							</c:choose>
						</option>
					
					</c:forEach>
					
				</select>
				<button type="submit">Valider</button>
			</form>		
					
				<div class="ProfilPke">
					<h4>Pokename : ${sessionScope.choosenPokemon.nickName }</h4>
					<p>Type : <c:choose>
								<c:when test="${ sessionScope.choosenPokemon.typePoke == 1 }"> : Fire</c:when>
								<c:when test="${ sessionScope.choosenPokemon.typePoke == 2 }"> : Water</c:when>
								<c:when test="${ sessionScope.choosenPokemon.typePoke == 3 }"> : Plant</c:when>
								<c:otherwise>Autre</c:otherwise>
							</c:choose> <p>
					<p>PV : ${sessionScope.choosenPokemon.pV } <p>
					<p>Attack : ${sessionScope.choosenPokemon.attack } <p>
					<p>Defense : ${sessionScope.choosenPokemon.defence } <p>
					<p>Speed : ${sessionScope.choosenPokemon.speed } <p>
					<p>Capacity : ${sessionScope.choosenPokemon.getCapacity() } <p>
					
					
				
				
				</div>
					
					
			</div>
					
<!-- 			///////////////////////////////////////////////// -->
<!-- 			///////////////////////////////////////////////// -->
			
			<h2> RandomPokemonIA</h2>
			<div class="SecondPke">
					<h4>Pokename : ${sessionScope.randomIAPokemon.nickName }</h4>
					<p>Type : <c:choose>
								<c:when test="${ sessionScope.randomIAPokemon.typePoke == 1 }"> : Fire</c:when>
								<c:when test="${ sessionScope.randomIAPokemon.typePoke == 2 }"> : Water</c:when>
								<c:when test="${ sessionScope.randomIAPokemon.typePoke == 3 }"> : Plant</c:when>
								<c:otherwise>Autre</c:otherwise>
							</c:choose> <p>
					<p>PV : ${sessionScope.randomIAPokemon.pV } <p>
					<p>Attack : ${sessionScope.randomIAPokemon.attack } <p>
					<p>Defense : ${sessionScope.randomIAPokemon.defence } <p>
					<p>Speed : ${sessionScope.randomIAPokemon.speed } <p>
					<p>Capacity : ${sessionScope.randomIAPokemon.getCapacity() } <p>	
			</div>
			

				<button type="submit">Valider</button>
		
		</div>
		
<!-- 			///////////////////////////////////////////////// -->
<!-- 			///////////////////////////////////////////////// -->		
		
		<div class="SecondRow">
			<p>Course of the Game</p>
		</div>
		
		
		
		
		
		
		</main>
	</div>
	
	

</body>
</html>