<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script src="js/rest.js"></script>
<title>Update User</title>
</head>
<body>
	<div style="padding-left:50px;font-family:monospace;">
        <h2>Update User</h2>
        <form id="updateForm">
            <div style="width: 100px; text-align:left;">
                <div style="padding:15px;">
                    User ID: <input name="id" />
                </div>
                <div style="padding:10px;">
                    Name: <input name="name" />
                </div>
                <div style="padding:10px;">
                    Age: <input name="age" />
                </div>
                <div style="padding:20px;text-align:center">
                    <input type="submit" value="Submit" />
                </div>
            </div>
        </form>
    </div>
</body>
</html>