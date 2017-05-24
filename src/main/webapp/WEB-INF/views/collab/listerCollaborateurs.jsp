<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ include file="../header.jsp" %>

<body>
	<h1>Les collaborateurs</h1>
	
	<ul>
		<c:forEach var="collab" items="${collaborateurs}">
			<li>${collab.matricule} - ${collab.nom} ${collab.prenom}</li>
		</c:forEach>
	</ul>
</body>
</html>