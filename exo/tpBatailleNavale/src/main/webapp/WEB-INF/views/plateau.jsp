<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>plateau</title>
</head>
<body>
<h1><%= "Bataille Navale!" %>
</h1>
<br/>
<c:forEach test="${plateauPlayerOne}" var="plateau">
    <div>${plateau.getHorizontal()}  ${plateau.getVertical()}</div>
</c:forEach>

</body>
</html>