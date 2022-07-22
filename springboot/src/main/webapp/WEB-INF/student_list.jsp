<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/7/20
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--用jstl遍历需要加一句话--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap-3.4.1-dist/css/bootstrap.css">
</head>
<body>
    <%--${list}--%><%--EL表达式不需要额外引入东西--%>
    <a href="${pageContext.request.contextPath}/student/getStudentAddPage">添加</a>
    <table class="table table-bordered table-condensed table-hover table-striped">
        <tr>
            <td>ID</td>
            <td>name</td>
            <td>age</td>
            <td>gender</td>
        </tr>
        <c:forEach var="student" items="${list}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.gender}</td>
                <td><a href="${pageContext.request.contextPath}/student/deleteById?id=${student.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
