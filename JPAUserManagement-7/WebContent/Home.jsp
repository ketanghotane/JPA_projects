<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	
	<c:choose>
		<c:when test="${sessionScope.username!=null}">
			<h2>Welcome <c:out value="${sessionScope.username }"></c:out> to the Home Page</h2>
			<h3><a href="showUsers.view">Find All Users</a></h3>
			<a href="logout.do">Log Out</a>
		</c:when>
		<c:otherwise>
			<c:redirect url="LoginForm.html"/>  		
		</c:otherwise>
	</c:choose>
	
</body>
</html>