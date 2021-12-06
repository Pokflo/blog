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

<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet">
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

					<form action="${pageContext.request.contextPath}/Inscription" method="post">

						<div class="form-group col-md-2 ">
							<label for="inputNom">Nom</label> <input type="text"
								class="form-control" id="inputNom" placeholder="nom" name="nom">
						</div>
						<div class="form-group col-md-2 ">
							<label for="inputPrenom">Prenom</label> <input type="text"
								class="form-control" id="inputPrenom" placeholder="prenom"
								name="prenom">
						</div>
						<div class="form-group col-md-2">
							<label for="jour">jour</label> <select class="form-control"
								id="jour" placeholder="jour" name="jour">
								<option></option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
								<option>8</option>
								<option>9</option>
								<option>10</option>
								<option>11</option>
								<option>12</option>
								<option>13</option>
								<option>14</option>
								<option>15</option>
								<option>16</option>
								<option>17</option>
								<option>18</option>
								<option>18</option>
								<option>19</option>
								<option>20</option>
								<option>21</option>
								<option>22</option>
								<option>23</option>
								<option>24</option>
								<option>25</option>
								<option>26</option>
								<option>27</option>
								<option>28</option>
								<option>29</option>
								<option>30</option>
								<option>31</option>
							</select>
						</div>
						<div class="form-group col-md-2">
							<label for="mois">mois</label> <select class="form-control"
								id="mois" placeholder="mois" name="mois">
								<option></option>
								<option value="1">Janvier</option>
								<option value="2">Fevrier</option>
								<option value="3">Mars</option>
								<option value="4">Avril</option>
								<option value="5">Mai</option>
								<option value="6">Juin</option>
								<option value="7">Juillet</option>
								<option value="8">Aout</option>
								<option value="9">Septembre</option>
								<option value="10">Octobre</option>
								<option value="11">Novembre</option>
								<option value="12">Decembre</option>
							</select>
						</div>
						<div class="form-group col-md-2">
							<label for="annee">Années</label> <select class="form-control"
								id="annee" placeholder="année" name="annee">
								<option></option>
								<option>1994</option>
								<option>1995</option>
								<option>1996</option>
								<option>1997</option>
								<option>1998</option>
								<option>1999</option>
								<option>2000</option>
								<option>2001</option>
								<option>2002</option>
								<option>2003</option>
								<option>2004</option>
								<option>2005</option>
								<option>2006</option>
								<option>2007</option>
								<option>2008</option>
								<option>2009</option>
								<option>2010</option>
								<option>2011</option>
								<option>2012</option>
								<option>2013</option>
								<option>2014</option>
								<option>2015</option>
								<option>2016</option>
								<option>2017</option>
								<option>2018</option>
								<option>2019</option>
								<option>2020</option>
							</select>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Email</label> <input type="email"
									class="form-control" id="inputEmail4" placeholder="Email"
									name="email">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Password</label> <input
									type="password" class="form-control" id="inputPassword4"
									placeholder="Password" name="mdp">
							</div>
						
						<div class="form-group col-md-6">
							<label for="inputPassword4">Password verification</label> <input
								type="password" class="form-control" id="inputPassword4"
								placeholder="Password" name="mdp2">
						</div>
					</form>
				<button type="submit" class="btn btn-primary">Sign in</button>
				

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