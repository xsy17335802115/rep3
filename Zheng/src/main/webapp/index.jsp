<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/4
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<%String path=request.getContextPath();%>
<head>
    <title></title>
</head>
<body>
    欢迎${uname}登录！
    <hr>
    <a href="<%=path%>test/hello1.do">展示所有的数据</a>
    <hr>
    <form method="post" action="<%=path%>test/hello2.do">
        名字：<input type="text" name="name">
        首：<input type="text" name="begin_date">
        尾：<input type="text" name="end_date">
        <input type="submit">
    </form>
</body>
</html>
