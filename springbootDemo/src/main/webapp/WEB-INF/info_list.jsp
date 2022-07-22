<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/20
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
    <%--${list}--%>
    <a href="${pageContext.request.contextPath}/Info/getInfoAddPage">添加</a>
    <table class="table table-bordered table-condensed table-hover table-striped">
         <tr>
             <td>ID</td>
             <td>CREATED_BY</td>
             <td>UPDATED_BY</td>
             <td>OUT_TRADE_NO</td>
             <td>PLATFORM_TYPE</td>
             <td>GOODS_INFO</td>
             <td>TRADE_AMT</td>
             <td>RESULT_MSG</td>
         </tr>
        <c:forEach var="info" items="${list}">
            <tr>
                <td>${info.id}</td>
                <td>${info.CREATED_BY}</td>
                <td>${info.UPDATED_BY}</td>
                <td>${info.OUT_TRADE_NO}</td>
                <td>${info.PLATFORM_TYPE}</td>
                <td>${info.GOODS_INFO}</td>
                <td>${info.TRADE_AMT}</td>
                <td>${info.RESULT_MSG}</td>
                <td><a href="${pageContext.request.contextPath}/Info/getInfoUpdateById?id=${info.id}">更改</a></td>
                <td><a href="${pageContext.request.contextPath}/Info/deleteById?id=${info.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
