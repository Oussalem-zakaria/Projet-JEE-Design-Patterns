<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body style="background-color: #dee2e6;">
	<div class="d-flex gap-3">
		<div>
			<jsp:include page="./sideBar.jsp"></jsp:include>
		</div>
		<div class="d-block content">
			<div class="d-flex card-user">
				<div class="div-head">Détails de l'étudiant</div>
				<form action="">
					<div class="div-body">
						<div class="div1">
							<label for="prenom" class="div-label">Prenom *</label> <input
								type="text" class="div-input" name="prenom" id="prenom"
								placeholder="prenom">
						</div>
						<div class="div1">
							<label class="div-label" for="nom">Nom *</label> <input
								type="text" class="div-input" placeholder="nom" name="nom"
								id="nom">
						</div>
						<div class="div1">
							<label class="div-label" for="cne">CNE *</label> <input
								type="text" class="div-input" placeholder="cne" name="cne"
								id="cne">
						</div>
						<div class="div1">
							<label class="div-label" for="situation_scolaire">Situation
								Scolaire *</label> <input type="text" class="div-input"
								placeholder="situation_scolaire" name="situation_scolaire"
								id="situation_scolaire">
						</div>
						<div class="d-flex justify-content-between pt-3">
							<input type="submit" name="submit"
								class="button button-sub btn btn-primary" value="Submit" /> <input
								type="submit" name="submit"
								class="button button-rest btn btn-primary" value="Reset" />
						</div>
					</div>
				</form>
			</div>
			<div class="d-flex card-user">
				<div class="div-head">Liste des étudiants</div>
				<table class="table">
					<thead class="table-light">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Prenom</th>
							<th scope="col">Nom</th>
							<th scope="col">CNE</th>
							<th scope="col">Situation Scolaire</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td scope="row">1</td>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>@mdo</td>
							<td class="d-flex gap-3">
								<a href="#"><img loading="lazy" src="vues/img/supprimer.svg" class="icon" /></a>
								<a href="#"><img src="vues/img/update.png" class="icon"  /></a>
							</td>
						</tr>
					</tbody>
				</table>
				</div>
			</div>
		</div>
	</div>
</body>