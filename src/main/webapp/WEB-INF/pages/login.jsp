<%--
  Created by IntelliJ IDEA.
  User: hc
  Date: 17-10-5
  Time: 下午7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.action" method="post">
    id：<input name="userId" type="text"/> <br/>
    密码：<input name="password" type="text"/> <br/>
    <input type="submit" value="登录">
</form>
</body>
</html>