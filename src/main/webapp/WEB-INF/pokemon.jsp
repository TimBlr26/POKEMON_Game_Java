<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création Pokémon</title>
</head>
<body>
	<c:import url="header.jsp">
		<c:param name="title" value="Créer votre Pokémon"/>
	</c:import>
	<form method="POST" action="pokemon">
		
		<div>
			<label for="nickname">Prénom de votre Pokémon: </label>
			<input type="text" name="nickname" id="nickname" value="${ pokemonForm.nickName }" />
		</div>
		<div>
			<p>Choisissez le type de votre Pokémon :</p>
			<label for="typePoke">Pokémon Feu </label>
			<input type="radio" name="typePoke" id="typePoke" value="1"/>
			<label for="typePoke">Pokémon Eau </label>
			<input type="radio" name="typePoke" id="typePoke" value="2"/>
			<label for="typePoke">Pokémon Plante </label>
			<input type="radio" name="typePoke" id="typePoke" value="3"/>
		</div>
		<div>
			<label for="capacity">Capacité de votre Pokémon: </label>
			<select name="capacity" id="capacity">
					<option disabled>Choisissez une capacité</option>
					<c:forEach items="${ capacityList }" var="capacity" varStatus="status">
						<option selected="${sessionScope.choosenCapacity.id == capacity.id }" value=${ capacity.id }><c:out value="${ capacity.CapName }" />
							<c:choose>
								<c:when test="${ pokemon.typePoke == 1 }"> : Fire</c:when>
								<c:when test="${ pokemon.typePoke == 2 }"> : Water</c:when>
								<c:when test="${ pokemon.typePoke == 3 }"> : Plant</c:when>
								<c:otherwise>Autre</c:otherwise>
							</c:choose>
						</option>
					</c:forEach>
					
				</select>
		</div>
		<div>
			<p>Point de vie de votre Pokémon : ${ pokemonForm.pV }</p>
			<p>Point d'attaque de votre Pokémon : ${ pokemonForm.getAttack() }</p>
			<p>Point de défence de votre Pokémon : ${ pokemonForm.defence }</p>
			<p>Vitesse de votre Pokémon : ${ pokemonForm.speed }</p>
			<button type="reset" value="reset">Réinitialiser compétences</button>
		</div>
		<div>
			<button type="submit">Créer le Pokémon</button>
		</div>

	</form>

</body>
</html>