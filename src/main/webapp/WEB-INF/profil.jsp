<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil</title>
<style>
<%@ include file="/ressources/styles/style.css"%>
</style>
</head>
<body>
<c:import url="header.jsp">
	<c:param name="title" value="Profil" />
</c:import>
<main>
<h2>Bonjour ${ sessionScope.name }</h2>
</main>
<footer>
</footer>
</body>
</html>