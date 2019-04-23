<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true" extraLocales="UTF-8"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>search</title>
</head>
<body>
    <s:form action="read" method="post">
        <s:textfield name="gameNum" label="请输入比赛编号"/>
        <s:submit value="查询"/>
    </s:form>
</body>
</html>
