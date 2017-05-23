<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../header.jsp" %>

<body>
	<h1>Les collaborateurs</h1>
	<a href="<c:url value='/collaborateurs/nouveau'></c:url>" class="btn btn-primary">Nouveau</a>
	
	<ul>
		<c:forEach var="collab" items="${listeNomsService}">
			<li>${collab.nom} ${collab.prenom} </li>
		</c:forEach>
	</ul>
</body>












<%@ include file="../footer.jsp" %>