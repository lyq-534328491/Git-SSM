<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>SSM整合测试</h2>

<%--<a href="account/findAll">SpringMVC整合测试查询</a>--%>
<%--<a href="account/findAll">Mybatis整合测试查询</a>--%>

<form action="account/saveAccount" method="post">
    姓名:<input type="text" name="name"><br>
    金额:<input type="text" name="money"><br>
    <input type="submit" value="保存"><br>
</form>

</body>
</html>
