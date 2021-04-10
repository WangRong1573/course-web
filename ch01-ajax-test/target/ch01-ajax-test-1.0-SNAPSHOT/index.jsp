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
                    dataType:"text",
                    success:function (resp) {
                        $("#demo").html(resp);
                    }
                })
            })
        })
    </script>
</head>
<body>
<button id="btn">点击显示文字</button>
<div id="demo" style="height: 200px;width: 200px;background-color: aqua">

</div>
<div style="height: 200px;width: 200px;background-color:palevioletred">
我是第二个div，我不会改变内容
</div>
</body>
</html>
