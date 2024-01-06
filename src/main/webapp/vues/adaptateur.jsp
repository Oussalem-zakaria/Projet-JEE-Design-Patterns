<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body style="background-color: #dee2e6;">
	<div class="d-flex gap-3">
		<div>
			<jsp:include page="./sideBar.jsp"></jsp:include>
		</div>
		<div class="d-block content mx-5 align-items-center mt-5">
			<form action="adaptateur" method="POST">

				<div class="card">
					<div class="card-header" style="font-size: 25px; font-weight: 500">Organiser
						un evénment</div>
					<div class="card-body">
						<h5 class="card-title">Choiser un Évinemet</h5>
						<select class="form-select div-input mb-4"
							aria-label="Default select example" name="event">
							<option selected>Choiser un Évinemet.</option>
							<option value="soutenance">soutenance</option>
							<option value="féte de fin d'année">féte de fin d'année</option>
						</select> <input type="submit" name="submit"
							class="button button-sub btn btn-primary" value="Submit" />
					</div>
				</div>
			</form>

		</div>

	</div>

	</div>
</body>