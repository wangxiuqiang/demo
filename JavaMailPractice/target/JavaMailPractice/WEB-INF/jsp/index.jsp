<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 18-3-11
  Time: 下午6:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>发送邮件</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/sendMail" method="post">
    <input type="submit" value="发送"/>
</form>
</body>
</html>
