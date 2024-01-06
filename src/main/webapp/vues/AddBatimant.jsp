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
				<div class="div-head">Détails de Batiment</div>
				<form action="">
					<div class="div-body">
						<div class="div1">
							<label for="Genre" class="div-label">Genre *</label> 
<!-- 							<input -->
<!-- 								type="text" class="div-input" name="Genre" id="Genre" -->
<!-- 								placeholder="Genre"> -->
							<select class="form-select div-input" aria-label="Default select example">
								<option selected>Choisissez le type de bâtiment.</option>
								<option value="1">One</option>
								<option value="2">Two</option>
								<option value="3">Three</option>
							</select>
						</div>
						<div class="div1">
							<label class="div-label" for="Emplacement">Emplacement *</label> <input
								type="text" class="div-input" placeholder="Emplacement" name="Emplacement"
								id="nom">
						</div>
						<div class="div1">
							<label class="div-label" for="Description">Description *</label>
							<input
								type="text" class="div-input" placeholder="Description" name="Description"
								id="Description">
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
				<div class="div-head">Liste des batiments</div>
				<table class="table">
					<thead class="table-light">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Genre</th>
							<th scope="col">Emplacement</th>
							<th scope="col">Description</th>
							<th scope="col">Adaptateur</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td scope="row">1</td>
							<td>Mark</td>
							<td>Otto</td>
							<td><c:out value="${event}"></c:out></td>
							<td>
								<a href="adaptateur" class="">Organiser un Événement</a>
							</td>
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

</body>
</html>
