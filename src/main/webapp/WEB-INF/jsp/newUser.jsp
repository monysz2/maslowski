<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New User</title>
</head>
<body>
<h1>New Person:</h1>
<form:form method = "POST" action = "newUser">
    <table>
        <tr>
            <td>
                <form:label path="firstName">First Name</form:label>
                <form:input path="firstName"/>
            </td>
            <td>
                <form:label path="lastName">Last Name</form:label>
                <form:input path="lastName"/>
            </td>
        </tr>
        <td>
            <td colspan="2">
        <input type="submit" value = "Submit"/>
        </td>
    </table>
</form:form>
</body>
</html>
