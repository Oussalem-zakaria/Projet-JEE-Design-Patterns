<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="UTF-8">
<title>Affichage_Etudiant</title>
</head>
<body>
	<div class="container py-3 my-5">
		<div class="card">
			<div class="card-header">
				<h5 class="card-title">Affichage_Etudiant</h5>
			</div>
			<div class="card-body">

				<ul>
					<li>Nom : ${ etudiant.nom }</li>
					</br>
					<li>Prenom : ${ etudiant.prenom }</li>
					</br>
					<li>CNE : ${ etudiant.CNE }</li>
				</ul>

				<div>
					<form action="/TP_JEE_DAO/updateuser" method="get">
						<c:if test="${empty message}">
							<div class="alert alert-danger">
								<p class="card-text">${message}</p>
							</div>
						</c:if>
						<div style="">
							<input hidden="hidden" name="nom" value="${etudiant.nom }">
							<input hidden="hidden" name="prenom" value="${etudiant.prenom }">
							<input hidden="hidden" name="CNE" value="${etudiant.CNE }">
							<div class="d-flex justify-content-between py-3">
								<input type="submit" value="Misse Ajour" class="btn btn-primary" />
								<input type="submit" value="Supprimer" class="btn btn-danger" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>