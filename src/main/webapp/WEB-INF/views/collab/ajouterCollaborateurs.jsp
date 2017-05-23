
<%@ include file="../header.jsp" %>

	<body>
		<form method="post" action="nouveau" class="form-horizontal">
			<fieldset>
			
			<!-- Form Name -->
			<legend>Nouveau Collaborateur</legend>
			
			<div class="form-group">
			  <label class="col-md-4 control-label" for="nom">Nom</label>  
			  <div class="col-md-4">
			  <input id="nom" name="nom" type="text" placeholder="nom..." class="form-control input-md" required="">
			    
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="prenom">Prenom</label>  
			  <div class="col-md-4">
			  <input id="prenom" name="prenom" type="text" placeholder="prénom..." class="form-control input-md" required="">
			    
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="dateDeNaissance">Date de naissance</label>  
			  <div class="col-md-4">
			  <input id="dateDeNaissance" name="dateDeNaissance" type="date" placeholder="dd/mm/yyyy" class="form-control input-md" required="">
			    
			  </div>
			</div>
			
			<!-- Textarea -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="adresse">Adresse</label>
			  <div class="col-md-4">                     
			    <textarea class="form-control" id="adresse" name="adresse"></textarea>
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="numSecu">Numéro de sécurité sociale</label>  
			  <div class="col-md-4">
			  <input id="numSecu" name="numSecu" type="text" placeholder="numéro de sécu" class="form-control input-md" required="">
			  </div>
			</div>
			<!-- Button -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="singlebutton"></label>
			  <div class="col-md-4">
			    <input type="submit" id="singlebutton" name="singlebutton" class="btn btn-primary" value="Enregistrer"></input>
			  </div>
			</div>
			</fieldset>
		</form>			
	</body>


<%@ include file="../footer.jsp" %>
