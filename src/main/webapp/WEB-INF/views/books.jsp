<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>BookStore</title>
    <link rel="stylesheet" type="text/css" href="resources/styles.css"/>
</head>
<body>
<table>
    <caption>Books for sale</caption>
    <thead>
    <tr>
        <th>Title</th>
        <th>Author</th>
        <th>Publish Date</th>
        <th>Price</th>
        <th>Sales Number</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.publishDate}</td>
            <td>${book.price}</td>
            <td>${book.salesNumber}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>