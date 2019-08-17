<%--
  Created by IntelliJ IDEA.
  User: 13967
  Date: 2019/8/17
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
    <h2>查询所有账户</h2>
    <c:forEach items="${list}" var="account">
        Name: <c:out value="${account.name}"/>, Money: <c:out value="${account.money}"/><br/>
    </c:forEach>
</body>
</html>
