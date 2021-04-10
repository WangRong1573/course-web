<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/10
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"one",
                    dataType:"json",
                    success:function (resp) {
                        alert(resp);
                        console.log(resp.name);
                        console.log(resp.age);
                    }
                })
            })
        })
    </script>
</head>
<body>
<button id="btn">点击显示文字</button>
</body>
</html>
