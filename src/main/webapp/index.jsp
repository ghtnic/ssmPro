<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="${pageContext.request.contextPath}/regist.action">
    id：<input name="userId" type="text"/> <br/>
    姓名：<input name="userName" type="text"/> <br/>
    密码：<input name="password" type="text"/> <br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
