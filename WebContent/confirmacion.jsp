<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   int idInsc = (Integer)request.getAttribute("idInsc");
   String nombre = (String) request.getAttribute("nombre");
   String celular = (String) request.getAttribute("celular");
   int idCurso = (int) request.getAttribute("idCurso");
   int idFormaDePago = (int) request.getAttribute("idFormaDePago");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de inscripciones</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>

<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="preInscripcion">Mantenedor de Cursos</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#"></a></li>
      <li><a href="preInscripcion">Inscribir Cursos</a></li>
    </ul>
  </div>
</nav>

<div align="justify" style="border-radius: 0.1em;width: 20em;background-color:threedface; margin-left: 1em;">
		<h1>Registro exitoso</h1>
		<p>
			Nombre de alumno:
			<%=nombre%></p>
		<p>
			 Teléfono contacto:
			<%=celular%></p>
		<p>
			 Id de curso:
			<%=idCurso%></p>
		<p>
			 Id forma de pago:
			<%=idFormaDePago%></p>
</div>

</body>
</html>