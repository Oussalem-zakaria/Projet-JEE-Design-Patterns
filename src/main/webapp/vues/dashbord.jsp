<jsp:include page="./base.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Dashboard</title>
</head>
<body style="background-color: #dee2e6;">
	<div class="d-flex gap-3">
		<div>
			<jsp:include page="./sideBar.jsp"></jsp:include>
		</div>
		<div class="dash-div d-block content">
			<div class="dash-div-2">
				<div class="column">
					<div class="dash-div-3">
						<img loading="lazy"
							src="https://cdn.builder.io/api/v1/image/assets/TEMP/ddb75268a9f5882c3cec095fab52693352ce7f7f98344c4da94b8f9e5711c163?"
							class="dash-img" />
						<div class="dash-div-4">
							<div class="dash-div-5">Students</div>
							<div class="dash-div-6">932</div>
						</div>
					</div>
				</div>
				<div class="column">
					<div class="dash-div-7">
						<img loading="lazy"
							src="https://cdn.builder.io/api/v1/image/assets/TEMP/bdbfb1afaa90bab6b7680662bf0fa1ca56fec5ed45004824d735eab9f21c9e9d?"
							class="dash-img" />
						<div class="dash-div-8">
							<div class="dash-div-9">Teachers</div>
							<div class="dash-div-10">754</div>
						</div>
					</div>
				</div>
				<div class="column">
					<div class="dash-div-11">
						<img loading="lazy"
							src="https://cdn.builder.io/api/v1/image/assets/TEMP/fc88bb1f0bee16bbd17ec52108bd8d9a60ca94eca028456edcd8c1f7e30c805e?"
							class="dash-img" />
						<div class="dash-div-12">
							<div class="dash-div-13">Events</div>
							<div class="dash-div-14">40</div>
						</div>
					</div>
				</div>
				<div class="column">
					<div class="dash-div-15">
						<img loading="lazy"
							src="https://cdn.builder.io/api/v1/image/assets/TEMP/c0f25ec08400fe22eb5e4a8bde69978ce544cd3c5b8d8e266046be707baa29fb?"
							class="dash-img" />
						<div class="dash-div-16">
							<div class="dash-div-17">Foods</div>
							<div class="dash-div-18">32k</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<style>
.dash-div {
	border-radius: 20px;
	background-color: var(- -Color-White, #fff);
	padding: 50px 70px 50px 47px;
}

@media ( max-width : 991px) {
	.dash-div {
	}
}

.dash-div-2 {
	gap: 20px;
	display: flex;
}

@media ( max-width : 991px) {
	.dash-div-2 {
		flex-direction: column;
		align-items: stretch;
		gap: 0px;
	}
}

.column {
	display: flex;
	flex-direction: column;
	line-height: normal;
	width: 26%;
	margin-left: 0px;
}

@media ( max-width : 991px) {
	.column {
		width: 100%;
	}
}

.dash-div-3 {
	display: flex;
	flex-grow: 1;
	justify-content: space-between;
	gap: 20px;
}

@media ( max-width : 991px) {
	.dash-div-3 {
		margin-top: 40px;
	}
}

.-dash-img {
	aspect-ratio: 1;
	object-fit: contain;
	object-position: center;
	width: 72px;
	overflow: hidden;
	max-width: 100%;
}

.dash-div-4 {
	align-self: start;
	display: flex;
	flex-grow: 1;
	flex-basis: 0%;
	flex-direction: column;
}

.dash-div-5 {
	color: var(- -Color-Gray-3, #a098ae);
	white-space: nowrap;
	font: 400 18px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-5 {
		white-space: initial;
	}
}

.dash-div-6 {
	color: var(- -Color-Text, #303972);
	margin-top: 20px;
	white-space: nowrap;
	font: 700 36px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-6 {
		white-space: initial;
	}
}

.column-2 {
	display: flex;
	flex-direction: column;
	line-height: normal;
	width: 27%;
	margin-left: 20px;
}

@media ( max-width : 991px) {
	.column-2 {
		width: 100%;
	}
}

.dash-div-7 {
	display: flex;
	flex-grow: 1;
	justify-content: space-between;
	gap: 20px;
}

@media ( max-width : 991px) {
	.dash-div-7 {
		margin-top: 40px;
	}
}

.dash-div-8 {
	align-self: start;
	display: flex;
	flex-grow: 1;
	flex-basis: 0%;
	flex-direction: column;
}

.dash-div-9 {
	color: var(- -Color-Gray-3, #a098ae);
	white-space: nowrap;
	font: 400 18px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-9 {
		white-space: initial;
	}
}

.dash-div-10 {
	color: var(- -Color-Text, #303972);
	margin-top: 21px;
	white-space: nowrap;
	font: 700 36px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-10 {
		white-space: initial;
	}
}

.column-3 {
	display: flex;
	flex-direction: column;
	line-height: normal;
	width: 23%;
	margin-left: 20px;
}

@media ( max-width : 991px) {
	.column-3 {
		width: 100%;
	}
}

.dash-div-11 {
	display: flex;
	flex-grow: 1;
	justify-content: space-between;
	gap: 20px;
}

@media ( max-width : 991px) {
	.dash-div-11 {
		margin-top: 40px;
	}
}

.dash-div-12 {
	align-self: start;
	display: flex;
	flex-direction: column;
}

.dash-div-13 {
	color: var(- -Color-Gray-3, #a098ae);
	white-space: nowrap;
	font: 400 18px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-13 {
		white-space: initial;
	}
}

.dash-div-14 {
	color: var(- -Color-Text, #303972);
	margin-top: 20px;
	white-space: nowrap;
	font: 700 36px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-14 {
		white-space: initial;
	}
}

.column-4 {
	display: flex;
	flex-direction: column;
	line-height: normal;
	width: 24%;
	margin-left: 20px;
}

@media ( max-width : 991px) {
	.column-4 {
		width: 100%;
	}
}

.dash-div-15 {
	display: flex;
	flex-grow: 1;
	justify-content: space-between;
	gap: 20px;
}

@media ( max-width : 991px) {
	.dash-div-15 {
		margin-top: 40px;
	}
}

.dash-div-16 {
	align-self: start;
	display: flex;
	flex-grow: 1;
	flex-basis: 0%;
	flex-direction: column;
}

.dash-div-17 {
	color: var(- -Color-Gray-3, #a098ae);
	white-space: nowrap;
	font: 400 18px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-17 {
		white-space: initial;
	}
}

.dash-div-18 {
	color: var(- -Color-Text, #303972);
	margin-top: 20px;
	white-space: nowrap;
	font: 700 36px Poppins, sans-serif;
}

@media ( max-width : 991px) {
	.dash-div-18 {
		white-space: initial;
	}
}
</style>
</html>