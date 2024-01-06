<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Création_Etudiant</title>
</head>
<body>
	<div class="container">
		<form method="post"
			action="${(btnName eq 'Submit') ? '/TP_JEE_DAO/saisieEtudiant' : '/TP_JEE_DAO/updateuser'}">
			<fieldset>
				<legend class="pt-5">
					<c:out value="${title}"></c:out>
				</legend>
				<label for="nom">Nom : </label> <input type="text" id="nom"
					name="nom" value="${etudiant.nom}" class="form-control" /> <br />
				<br /> <label for="prenom">Prenom : </label> <input type="text"
					id="prenom" name="prenom" value="${etudiant.prenom }"
					class="form-control" /> <br /> <br /> <label for="CNE">CNE
					: </label> <input type="text" id="CNE" name="CNE" value="${etudiant.CNE }"
					class="form-control" ${(btnName eq 'Update') ? 'readonly' : ''} />
				<br /> <br />
				<div class="d-flex justify-content-between">
					<div>
						<input type="submit" value="${btnName}" class="btn btn-primary"
						name="${btnName}" />
					</div> 
					<div>
						<input type="reset" value="Remettre à zéro"
						class="btn btn-secondary" /> <br />
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>