<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<body
	style="background-image: radial-gradient(closest-side ellipse at center, white, gray)">

	<ul class="nav">
		<li class="nav-item"><a class="nav-link"
			href="http://localhost:8080/blog/index"
			style="background-color: rgb(109, 216, 188)">Acceuil</a></li>

	</ul>
	<table width="100%" border="1" cellspacing="1" cellpadding="1">
		<tr>
			<td><div align=center>

					<form action="${page.Context.request.contextPath }/blog/Login"
						method="post">
						<div>
							<label for="email">Email</label>
							<div>
								<input type="text" name="email" id="email"
									pattern="^[a-z '-áàâäãåçéèêëíìîïñóòôöõúùûüýÿ]{2,50}"
									value="${email}">
							</div>
							<c:if test="${not empty err_email}">
								<div>
									<i style="color: red;">${err_email}</i>
								</div>
							</c:if>
						</div>
						<div>
							<label for="mdp">Mot de passe</label>
							<div>
								<input type="text" name="mdp" id="mdp"
									pattern="^[a-z '-áàâäãåçéèêëíìîïñóòôöõúùûüýÿ]{2,50}"
									value="${mdp}">
							</div>
							<c:if test="${not empty err_mdp}">
								<div>
									<i style="color: red;">${err_mdp}</i>
								</div>
							</c:if>
						</div>
						<br>
						<div>
							<input type="submit" value="Se connecter"
								style="background-color: rgb(0, 144, 212);">
						</div>
					</form>
				</div></td>
		</tr>
	</table>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous">
		
	</script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>