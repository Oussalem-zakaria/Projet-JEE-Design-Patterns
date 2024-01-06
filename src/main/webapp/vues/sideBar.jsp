<%@page import="jakarta.servlet.RequestDispatcher"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="jakarta.servlet.ServletException"%>
<%@ page import="java.io.IOException"%>

<%
String servletPath = (String) request.getRequestURI();
String name = servletPath.split("/")[3].replace(".jsp", "").trim();
%>

<div class="div">

	<div class="div-2">
		<img alt="logofsa" src="vues/img/logofsa.png" class="img-logo">
	</div>
	<div class="div-5 <%=name.equals("dashbord") ? "active" : ""%>">
		<img loading="lazy"
			src="https://cdn.builder.io/api/v1/image/assets/TEMP/d2981cb4f03a1aae5cf0dda5b8c3b4d79a24093024c0845d683b1160f60f847e?apiKey=5c06326714184a76b7a18267558737a6&"
			class="img" />
		<a href="dashbord" class="div-6">Tableau de bord</a>
	</div>
	<div class="div-5 <%=name.equals("addUser") ? "active" : ""%> ">
		<img loading="lazy" src="vues/img/student.png" class="img" />
		<!-- 		<div class="div-6">Étudiants</div> -->
		<a href="test2" class="div-6">Étudiants</a>
	</div>
<%-- 	<div class="div-5 <%=name.equals("addTecher") ? "active" : ""%>"> --%>
<!-- 		<img loading="lazy" -->
<!-- 			src="https://cdn.builder.io/api/v1/image/assets/TEMP/525311f63f502b409f316eaaf9d9a6ea305ad16e48634cb401b03c8278529638?apiKey=5c06326714184a76b7a18267558737a6&" -->
<!-- 			class="img" /> -->
<!-- 		<a href="test" class="div-6">Enseignantes</a> -->
<!-- 	</div> -->
	<div class="div-5 <%=name.equals("event") ? "active" : ""%>">
		<img loading="lazy"
			src="https://cdn.builder.io/api/v1/image/assets/TEMP/4b7b9be4f093fcaa386b6ddb4e119036a4d79ffdf126ab24a071f88e1aa22cf3?apiKey=5c06326714184a76b7a18267558737a6&"
			class="img" />
		<a href="test" class="div-6">Event</a>
	</div>
	<div class="div-5 <%=name.equals("AddBatimant") ? "active" : ""%>">
		<img loading="lazy" src="vues/img/building.png" class="img" />
		<!-- 		<div class="div-6">Bâtiment</div> -->
		<a href="test" class="div-6">Bâtiment</a>
	</div>
	<div class="div-5 <%=name.equals("addDepartemat") ? "active" : ""%>">
		<img loading="lazy" src="vues/img/departemet.png" class="img" />
		<!-- 		<div class="div-6">Bâtiment</div> -->
		<a href="addDepartemat" class="div-6">Déppartemant</a>
	</div>
	<div class="div-5">
		<img loading="lazy"
			src="https://cdn.builder.io/api/v1/image/assets/TEMP/1c90bd96422be2d0ab3c191f8c76737dc09a564fa40d47de8f72cd6441a84522?apiKey=5c06326714184a76b7a18267558737a6&"
			class="img" />
		<a href="addPersonnel" class="div-6">Personnel</a>
	</div>
	<div class="div-5">
		<img loading="lazy"
			src="https://cdn.builder.io/api/v1/image/assets/TEMP/c9b952d13561f751967fd31ab2b1afc56f61ab6dbd3accf2912817f0cb1357fb?apiKey=5c06326714184a76b7a18267558737a6&"
			class="img" />
		<a href="mediateur" class="div-6">Mediateur</a>
	</div>
	<div class="div-5">
		<img loading="lazy"
			src="https://cdn.builder.io/api/v1/image/assets/TEMP/c9b952d13561f751967fd31ab2b1afc56f61ab6dbd3accf2912817f0cb1357fb?apiKey=5c06326714184a76b7a18267558737a6&"
			class="img" />
		<a href="chat" class="div-6">Chat</a>
	</div>

</div>