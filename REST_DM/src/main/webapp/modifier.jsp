<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script src="js/rest.js"></script>
<title>Modifier une personne</title>
</head>
<body>
	<div style="padding-left:50px;font-family:monospace;">
        <h2>Modifier une personne</h2>
        <form id="updateForm">
            <div style="width: 100px; text-align:left;">
                <div style="padding:15px;">
                    ID de la personne: <input name="id" />
                </div>
                <div style="padding:10px;">
                    Nom: <input name="name" />
                </div>
                <div style="padding:10px;">
                    Age: <input name="age" />
                </div>
                <div style="padding:10px;">
                    Adresse: <input name="adresse" />
                <div style="padding:20px;text-align:center">
                    <input type="submit" value="Submit" />
                </div>
            </div>
        </form>
    </div>
</body>
</html>