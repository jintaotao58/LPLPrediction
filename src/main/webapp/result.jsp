<%--
  Created by IntelliJ IDEA.
  User: 枫化蛋蛋
  Date: 2019/4/22
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
         import="java.util.List" import="java.util.*" import="com.LPLPrediction.beans.Match"  %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>result</title>
</head>
<body>

    <%
        List list = (List)session.getAttribute("message");
        for(int i=0;i<list.size();i++)
        {
            Match match = (Match) list.get(i);
    %>
    <table>
        <tr>
            <td>比赛编号：</td>
            <td><%= match.getGame_num() %></td>
        </tr>
        <tr>
            <td>比赛胜者：</td>
            <td><%= match.getWinner() %></td>
        </tr>
        <tr>
            <td>比赛时常：</td>
            <td><%= match.getTime() %></td>
        <tr>
    </table>
    <br><br>
    <%
        }
    %>

</body>
</html>
