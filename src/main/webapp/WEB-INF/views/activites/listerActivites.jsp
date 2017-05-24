<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
<title>SGP - App</title>
</head>
<body>
	<h1 style="text-align: center; margin: 20px 0 30px 0">Activités
		depuis le démarrage de l'application</h1>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Date/Heure</th>
				<th>Libellé</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="activites" items="${listeActivites}">
				<tr>
					<td>${activites.dateHeure}</td>
					<td>${activites.typeString} : ${activites.matricule}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>