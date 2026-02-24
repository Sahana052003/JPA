
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Form</title>
</head>
<body>
<table border="2">

<tr>
<th>FirstName</th>
<th>lastName</th>
<th>Email</th>
<th>password</th>
<th>companyName</th>
<th>PhoneNumber</th>
</tr>


<c:forEach items="${hello}" var="singleData">
<tr>
<td>${singleData.firstName}</td>
<td>${singleData.lastName}</td>
<td>${singleData.email}</td>
<td>${singleData.password}</td>
<td>${singleData.companyName}</td>
<td>${singleData.mobileNumber}</td>
</tr>
</c:forEach>
</table>

</body>
</html>