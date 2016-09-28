
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/28
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${!empty errorMsg}">
    <h3>${errorMsg}</h3>
</c:if>
<form action="login" method="post">
    <h2>欢迎登陆</h2>
    <p>
        <label for="username">用户名</label>
        <input type="text" id="username" name="username">
    </p>
    <p>
        <label for="password">密码</label>
        <input type="password" id="password" name="password">
    </p>
    <p>
        <input type="submit" value="登陆">
    </p>
</form>
</body>
</html>
