<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 李贺
  Date: 2019/4/8
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table>
        <tr>标号</tr>
        <tr>书名</tr>
        <tr>作者</tr>

        <c:forEach var="b" items="${requestScope.list}">
            ${b.id}
            ${b.name}
            ${b.acthor}
        </c:forEach>

    </table>
</body>
</html>
