
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<link href="images/skin.css" rel="stylesheet" type="text/css" />
<style type="text/css">
    <!--
    body {
        margin-left: 0px;
        margin-top: 0px;
        margin-right: 0px;
        margin-bottom: 0px;
        background-color: #EEF2FB;
    }
    #manageSubject table  td{
        font-size:12px;
    }
    -->
</style>
<body>

<table width="100%" border="0" cellpadding="0" cellspacing="0">

    <form action="find" method="post">
        <table border="0" width="90%" align="center" style="margin-top:10px">
            <tr>
                <td>日期</td>
                <td><input class="text" style="width:180px" name="date" /></td>
                <td>文章ID</td>
                <td><input class="text" style="width:180px" name="news_id" /></td>
                <td><button>查询</button></td>
            </tr>
        </table>
    </form>
    <div id="manageSubject" align="center">
        <table width="95%" cellspacing="10">
            <tr align="center">
                <td>日期</td>
                <td>文章ID</td>
                <td>相似文章ID</td>
                <td>分值</td>
                <td>类型</td>
                <td>分值</td>
                <td>手工分值</td>
                <td>增加</td>
                <td>修改</td>
                <td>删除</td>
            </tr>
            <c:forEach items="${news}" var="news">
                <tr align="center">
                    <td>${news.statis_time}</td>
                    <td>${news.news_id}</td>
                    <td>${news.like_news_id}</td>
                    <td>${news.online_point}</td>
                    <td>${news.online_type}</td>
                    <td>${news.point}</td>
                    <td>${news.made_point}</td>
                    <td><a href="newsAdd.jsp">增加</a></td>
                    <td><a href="newsUpdateBefore?news_id=${news.news_id}&like_news_id=${news.like_news_id}&statis_time=${news.statis_time}">更新</a></td>
                    <td><a href="">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </table>
</body>
</html>
