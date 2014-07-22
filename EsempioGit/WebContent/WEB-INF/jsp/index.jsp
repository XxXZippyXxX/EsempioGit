<%@    taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>

<title>Esempio di Git Homepage</title>
</head>
<body>
    <form:form name="login" action="login.do" method="post" commandName="utente">
        <table>
            <tr>
                <td colspan="2"><h3>Login utente</h3></td>
            </tr>
            <tr>
                <td><label>Username</label></td>
                <td><form:input path="username"/></td>
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><form:password path="password"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Login" /></td>
                <td></td>
            </tr>
        </table>
    </form:form>
    
</body>
</html>