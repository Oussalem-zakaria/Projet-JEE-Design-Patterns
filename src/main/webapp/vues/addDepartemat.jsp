<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Add Department</title>
</head>
<body style="background-color: #dee2e6;">
	<div class="d-flex gap-3">
		<div>
			<jsp:include page="./sideBar.jsp"></jsp:include>
		</div>
		<div class="d-block content">
			<div class="d-flex card-user">
				<div class="div-head">Détails de Déppartemant</div>
				<form action="">
					<div class="div-body">
						<div class="div1">
							<label for="nomDeppartemant" class="div-label">Nom de Déppartemant
								*</label> <input type="text" class="div-input"
								name="nom de déppartemant" id="nomDeppartemant"
								placeholder="nomDeppartemant">
						</div>
						<div class="div1">
							<label class="div-label" for="chef">Chef de Déppartemant
								*</label>
							<!-- 								<input type="text" class="div-input" -->
							<!-- 								placeholder="Emplacement" name="Emplacement" id="nom"> -->
							<select class="form-select div-input"
								aria-label="Default select example" id="chef">
								<option selected>Chef de Déppartemant</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div>
						<div class="div1">
							<label class="div-label" for="batiments">Batiments *</label> <select
								class="form-select div-input"
								aria-label="Multiple select example" id="batiments" multiple>
								<option selected>choisir une Bâtiment</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div>
						<div class="div1">
							<label class="div-label" for="deppartemant">Déppartemant *</label> <select
								class="form-select div-input"
								aria-label="Multiple select example" id="deppartemant" multiple>
								<option selected>choisir une Déppartemant</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
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
			<div class="d-flex card-user mt-5">
				<div class="div-head">Liste des déppartemants</div>
				<table class="table">
					<thead class="table-light">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Nom de Déppartemant</th>
							<th scope="col">Chef de déppartemant</th>
							<th scope="col">Batiments</th>
							<th scope="col">Déppartemant</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td scope="row">1</td>
							<td>Mark</td>
							<td>Otto</td>
							<td>Otto</td>
							<td>Otto</td>
							<td class="d-flex gap-3"><a href="#"><img loading="lazy"
									src="vues/img/supprimer.svg" class="icon" /></a> <a href="#"><img
									src="vues/img/update.png" class="icon" /></a></td>
						</tr>
						<tr>
							<td scope="row">2</td>
							<td>Mark</td>
							<td>Otto</td>
							<td>Otto</td>
							<td>Otto</td>
							<td class="d-flex gap-3"><a href="#"><img loading="lazy"
									src="vues/img/supprimer.svg" class="icon" /></a> <a href="#"><img
									src="vues/img/update.png" class="icon" /></a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

	</div>

</body>
</html>
