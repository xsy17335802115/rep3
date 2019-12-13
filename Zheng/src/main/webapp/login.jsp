<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/9
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<%String path=request.getContextPath();%>
<head>
    <title>登录</title>
</head>
<body>
<form action="<%=path%>/check.do" method="post">
    <input type="text" name="adminName">
    <input type="password" name="adminPassword">
    <button type="submit">登录</button>
</form>
</body>
</html>
