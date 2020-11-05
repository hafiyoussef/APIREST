<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User</title>
</head>
<body>
	 <div style="padding-left:50px;font-family:monospace;">
        <h2>Create Prof</h2>
        <form action="rest/api/profs/post" method="POST">
            <div style="width: 100px; text-align:left;">
                <div style="padding:15px;">
                    id: <input name="id" />
                </div>
                <div style="padding:10px;">
                    nom: <input name="name" />
                </div>
                <div style="padding:10px;">
                    prenom: <input name="age" />
                </div>
                <div style="padding:10px;">
                    date_naissance: <input name="age" />
                </div>
                <div style="padding:20px;text-align:center">
                    <input type="submit" value="Submit" />
                </div>
            </div>
        </form>
    </div>
</body>
</html>