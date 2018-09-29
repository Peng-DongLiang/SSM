<%--
  Created by IntelliJ IDEA.
  User: 11967
  Date: 2018/9/11
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#button").click(function () {
                $.post("account/ajaxtest",{},function () {

                });
                // alert(1);
               <%--$.ajax({--%>
                    <%--url:"${pageContext.request.contextPath}/account/ajaxtest",--%>
                    <%--contentType:"application/json;charset=UTF-8",--%>
                    <%--data:'{"name":"小华","sex":"女","birthday":"2018-09-09"}',--%>
                    <%--dataType:"json",--%>
                    <%--type:"post",--%>
                    <%--success:function (data) {--%>
                        <%--alert(data);--%>
                    <%--}--%>
                <%--});--%>
                alert(1)
            });
        });
    </script>
    <title>Title</title>
</head>
<body>
<h3>修改用户信息</h3>
<%--<form action="${pageContext.request.contextPath}/account/addUser" method="post">--%>
    <%--账户ID:<input type="text" name="aid"/></br>--%>
    <%--账户名:<input type= "text" name="aname"/></br>--%>
    <%--账户余额:<input type="text" name="money"/></br>--%>
    <%--户主:<input type="text" name="user.name"/></br>--%>
    <%--性别:<input type="radio" name="user.sex" value="男" checked="checked">男--%>
    <%--<input type="radio" name="user.sex" value="女">女</br>--%>
    <%--出生日期:<input type="text" name="user.birthday">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>
<%--<a href="Account/query">查询账户</a>--%>
<%--<a href="/Account/forwardTest">转发</a>--%>
<%--<a href="/Account/sendTest">重定向</a>--%>
<button id="button">提交</button>
<a href="${pageContext.request.contextPath}/account/modelAndView">点击</a>
</body>
</html>
