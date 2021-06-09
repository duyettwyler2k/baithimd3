<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>List Product</h1>
<a href="/products?action=create">Create new product</a>
<form>
    <input type="text" name="search">
    <button>Search</button>
</form>
<table>
<tr>
    <td>id</td>
    <td>name</td>
    <td>price</td>
    <td>number</td>
    <td>color</td>
    <td>mota</td>
    <td>danh_sach</td>

</tr>
<c:forEach items="${products}" var="product">
    <tr>
        <td><c:out value="${product.id}"></c:out></td>
        <td><c:out value="${product.name}"></c:out></td>
        <td><c:out value="${product.price}"></c:out></td>
        <td><c:out value="${product.number}"></c:out></td>
        <td><c:out value="${product.color}"></c:out></td>
        <td><c:out value="${product.mota}"></c:out></td>
        <td><c:out value="${product.danh_sach}"></c:out></td>
        <td><a href="/products?action=update&id=${product.id}">Exit</a></td>
        <td><a href="/products?action=delete&id=${product.id}">Delete</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
