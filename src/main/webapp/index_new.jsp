<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Bootstrap 实例 - 导航栏中的表单</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/example-fixed-layout.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.css">
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


<div class="container">

    <!-- Main hero unit for a primary marketing message or call to action -->
    <div class="leaderboard">
        <h1>w3cschool Web Store</h1>
        <p>Try and purchase HTML5, JS, Ruby, PHP-MySQL based web apps to enhance your productivity at affordable price.</p>
        <p><a class="btn btn-success btn-large">Sign Up for a 30 day free trial</a></p>
    </div>

    <!-- Example row of columns -->
    <div class="row">
        <div class=" col-xs-4">
            <h2>HTML5 and JS Apps</h2>
            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
            <p><a class="btn btn-success btn-large" href="#">View apps</a></p>
        </div>
        <div class=" col-xs-4">
            <h2>Ruby Apps</h2>
            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
            <p><a class="btn btn-success btn-large" href="#">View apps</a></p>
        </div>
        <div class=" col-xs-4">
            <h2>PHP MySQL Apps</h2>
            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
            <p><a class="btn btn-success btn-large" href="#">View apps</a></p>
        </div>
    </div>

    <div class="container">
        <hr>

        <footer>
            <p>© Company 2012</p>
        </footer>

    </div> <!-- /container -->

</html>
