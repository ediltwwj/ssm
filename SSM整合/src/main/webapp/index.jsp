<%--
  Created by IntelliJ IDEA.
  User: 13967
  Date: 2019/8/17
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM整合1.0</title>
</head>
<body>
    <a href="account/findallaccount">查询所有账户</a>

    <hr/>

    <h3>上传用户信息</h3>
    <form action="account/saveaccount" method="post">
        姓名: <input type="text" name="name"/><br/>
        金额: <input type="text" name="money"/><br/>
        <input type="submit" value="保存用户"/><br/>
    </form>
</body>
</html>
