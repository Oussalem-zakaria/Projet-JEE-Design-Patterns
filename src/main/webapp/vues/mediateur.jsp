<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body style="background-color: #dee2e6;">
	<div class="d-flex gap-3">
		<div>
			<jsp:include page="./sideBar.jsp"></jsp:include>
		</div>
		<div class="d-block content mx-5 align-items-center mt-5">
			<div class="d-flex card-user">
				<div class="div-head">Ajoutter un médiateur</div>
				<form action="mediateur" method="post">
					<div class="div-body">
						<div class="div1">
							<label for="Genre" class="div-label">Nom de médiateur *</label> <select
								class="form-select div-input"
								aria-label="Default select example" name="mediateur">
								<option selected>Choisissez le Nom de médiateur.</option>
								<option value="info">Info</option>
								<option value="pc">PC</option>
							</select>
						</div>
						<div class="div1">
							<label class="div-label" for="deppartemant">La liste des
								chef de départements *</label> <select class="form-select div-input"
								aria-label="Multiple select example" id="deppartemant"
								name="chefs" multiple>
								<option value="chef info">One</option>
								<option value="chef pc">Two</option>
								<option value="chef svt">Three</option>
							</select>
						</div>
						<div class="d-flex justify-content-between pt-3">
							<input type="submit" name="submit"
								class="button button-sub btn btn-primary" value="Submit" /> <input
								type="submit" name="submit"
								class="button button-rest btn btn-primary" value="Reset" />
						</div>
						<c:if test="${not empty message and chefs != null}">
							<div class="div1">
								<div class="alert alert-success">
									<c:out value="${message}"></c:out>
								</div>
							</div>
						</c:if>
					</div>
				</form>
			</div>
			<!-- 			// -->
			<c:if test="${chefs != null}">
				<div class="d-flex card-user">
					<div class="div-head">Liste des médiateur</div>
					<table class="table">
						<thead class="table-light">
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nom de médiateur</th>
								<th scope="col">La liste des chef de départements</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td scope="row">1</td>
								<td><c:out value="${mediateur}"></c:out></td>
								<td>
									<ul class="d-flex gap-3" style="list-style: none;margin: 0;padding-left: 0;">
										<c:forEach var="chef" items="${chefs}">
											<li><c:out value="${chef}" /></li>
										</c:forEach>
									</ul>
								</td>
								<td class="d-flex gap-3"><a href="#"><img
										loading="lazy" src="vues/img/supprimer.svg" class="icon" /></a> <a
									href="#"><img src="vues/img/update.png" class="icon" /></a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</c:if>
		</div>
	</div>
</body>