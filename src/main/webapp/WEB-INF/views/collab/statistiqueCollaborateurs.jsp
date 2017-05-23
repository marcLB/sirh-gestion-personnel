<%@page import="dev.sgp.entite.VisiteWeb"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../header.jsp" %>

<body>
	<h1>Statistiques</h1>
	
	<ul>
		<c:forEach var="stats" items="${listeStats}">
			<li>${stats.chemin}</li>
		</c:forEach>
	</ul>
</body>	

<%@ include file="../footer.jsp" %>