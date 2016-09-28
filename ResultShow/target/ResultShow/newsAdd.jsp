<%--
  Created by IntelliJ IDEA.
  User: v_jdqi
  Date: 2016/9/8 0008
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>文章相似添加</title>
    <style type="text/css">
        <!--
        body {
            margin-left: 0px;
            margin-top: 0px;
            margin-right: 0px;
            margin-bottom: 0px;
            background-color: #EEF2FB;
        }

        #addSubjectForm table td {
            font-size: 12px;
        }

        -->
    </style>
    <link href="images/skin.css" rel="stylesheet" type="text/css">
</head>

<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17"
                                                                             height="29"/></td>
        <td valign="top" background="images/content-bg.gif">
            <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
                <tr>
                    <td height="31">
                        <div class="titlebt">添加相似文章</div>
                    </td>
                </tr>
            </table>
        </td>
        <td width="16" valign="top" background="images/mail_rightbg.gif"><img src="images/nav-right-bg.gif" width="16"
                                                                              height="29"/></td>
    </tr>
    <tr>
        <td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
        <td valign="top" bgcolor="#F7F8F9">
            <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="53%" valign="top">&nbsp;</td>
                </tr>
                <tr>
                    <td valign="middle"><span class="left_txt">
			<div id="addSubjectForm" align="center">
				<form action="newsAdd" method="post">
				<table border="0" cellspacing="10" cellpadding="0">
				  <tr>
					<td colspan="2"><FONT color="red"><c:if test="${!empty errorMsg}">
                        <h3>${errorMsg}</h3>
                    </c:if></FONT></td>
				  </tr>
				  <tr>
					<td>日期:</td>
					<td><input type="text" name="statis_time" size="20"></td>
				  </tr>
				  <tr>
					<td>文章ID:</td>
					<td><input type="text" name="news_id" size="20"></td>
				  </tr>
				  <tr>
					<td>相似文章ID:</td>
					<td><input type="text" name="like_news_id" size="20"></td>
				  </tr>
				  <tr>
					<td>分值:</td>
					<td><input type="text" name="online_point" size="20"></td>
				  </tr>
				  <tr>
					<td>类型:</td>
					<td><input type="text" name="online_type" size="20"></td>
				  </tr>
				  <tr>
					<td>分值:</td>
					<td><input type="text" name="point" size="20"></td>
				  </tr>
				  <tr>
					<td>手工分值:</td>
					<td><input type="text" name="made_point" size="20"></td>
				  </tr>
				  <tr>
				  	<td colspan="2"><div align="center">
				  	  <input type="submit" value="录入">
				  	  <input type="reset" value="重置">
			  	  </div>
				</td>
				  </tr>
			</table>
			</form>
			</div>
                    </span>
                    </td>

                </tr>

            </table>
        </td>
        <td background="images/mail_rightbg.gif">&nbsp;</td>
    </tr>
    <tr>
        <td valign="bottom" background="images/mail_leftbg.gif"><img src="images/buttom_left2.gif" width="17"
                                                                     height="17"/></td>
        <td background="images/buttom_bgs.gif"><img src="images/buttom_bgs.gif" width="17" height="17"></td>
        <td valign="bottom" background="images/mail_rightbg.gif"><img src="images/buttom_right2.gif" width="16"
                                                                      height="17"/></td>
    </tr>
</table>
</body>
</html>
