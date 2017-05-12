<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link>
    <title>博客类别管理页面</title>
    <%@include file="./common/head.jspf" %>
    <link type="text/css" rel="stylesheet" href="/static/bootstrap3/css/bootstrap.min.css"></link>
    <style>
        #dg{
            margin-top: 20px;
        }
    </style>
</head>
<body>

    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">菜鸟教程</a>
            </div>
            <div>
                <form class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">提交</button>
                </form>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
            </ul>
        </div>
    </nav>

    <table id="dg" title="博客类别管理" class="easyui-datagrid" fitColumns="true" pagination="true"
           url="${blog}/admin/blogType/listBlogType" toolbar="#tb">

        <thead>
            <tr>
                <th field="cb" checkbox="true" align="center"></th>
                <th field="id" width="20" align="center">编号</th>
                <th field="typeName" width="100" align="center">博客分类名称</th>
                <th field="orderNum" width="100" align="center">类别排序</th>
            </tr>
        </thead>
    </table>
</body>
</html>
