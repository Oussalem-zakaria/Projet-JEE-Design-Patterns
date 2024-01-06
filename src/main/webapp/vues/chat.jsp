<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body style="background-color: #dee2e6;">
	<div class="d-flex gap-3">
		<div>
			<jsp:include page="./sideBar.jsp"></jsp:include>
		</div>
		<div class="d-block content mx-5 align-items-center mt-5">
			<div class="d-flex card-user">
				<div class="div-head">Messages</div>
				<form action="mediateur" method="post">
					<div class="div-body">
						<div class="div1">
							<label for="Genre" class="div-label">Expediteur *</label> <select
								class="form-select div-input"
								aria-label="Default select example" name="expediteur" disabled>
								<option selected>Choisissez le Nom de expediteur.</option>
							</select>
						</div>
						<div class="div1">
							<label class="div-label" for="destinaire">Destinaire *</label> <select class="form-select div-input"
								aria-label="Multiple select example" id="destinaire"
								name="destinaire" multiple>
								<option value="chef info">One</option>
								<option value="chef pc">Two</option>
								<option value="chef svt">Three</option>
							</select>
						</div>
						<div class="div1">
							<textarea placeholder="Message ici ..." class="form-select div-input"></textarea>
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

		</div	>
</body>