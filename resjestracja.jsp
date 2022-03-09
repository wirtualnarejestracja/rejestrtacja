<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1"
    <title>Tytul</title>
</head>
<body>
<div align="center">
    <h1>Test rejestracji</h1>
    <form action="<%= request.getContextPath()%>/register" method="post">
        <table style="width:80%">
            <tr>
                <td>
                    Marka
                <td><input type="text" name="marka" /></td>
                </td>
            </tr>
            <tr>
                <td>
                    Kolor
                <td><input type="text" name="kolor" /></td>
                </td>
            </tr>
            <tr>
                <td>
                    Silnik
                <td><input type="text" name="silnik" /></td>
                </td>
            </tr>
            <tr>
                <td>
                    Imie
                <td><input type="text" name="imie" /></td>
                </td>
            </tr>
        </table>
        <input type="sumbit" value="Sumbit" />
    </form>
</div>
</body>
</html>