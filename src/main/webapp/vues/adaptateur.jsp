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
						un ev�nment</div>
					<div class="card-body">
						<h5 class="card-title">Choiser un �vinemet</h5>
						<select class="form-select div-input mb-4"
							aria-label="Default select example" name="event">
							<option selected>Choiser un �vinemet.</option>
							<option value="soutenance">soutenance</option>
							<option value="f�te de fin d'ann�e">f�te de fin d'ann�e</option>
						</select> <input type="submit" name="submit"
							class="button button-sub btn btn-primary" value="Submit" />
					</div>
				</div>
			</form>

		</div>

	</div>

	</div>
</body>