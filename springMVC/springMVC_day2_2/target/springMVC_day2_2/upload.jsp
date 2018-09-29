<%--
  Created by IntelliJ IDEA.
  User: 11967
  Date: 2018/9/11
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<script src="js/jquery.min.js"></script>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/file" method="post" enctype="multipart/form-data">
    文件上传:<input type="file" name="upload"/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
