<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
El researcher:
<table>
	<tr>
		<td><c:out value="${rs.id}" /></td>
		<td><c:out value="${rs.name}" /></td>
		<td><c:out value="${rs.affiliation}" /></td>
		<td><c:out value="${rs.email}" /></td>
	</tr>
</table>

</body>
</html>