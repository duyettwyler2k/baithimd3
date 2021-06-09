<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>Edit product</h1>
<a href="/products">List Product</a>
<form method="post">
    <tr>
        <td>name</td>
        <td><input type="text" name="name" value="${product.name}"></td>
    </tr>
    <tr>
        <td>price</td>
        <td><input type="text" name="price" value="${product.price}"></td>
    </tr>
    <tr>
        <td>number</td>
        <td><input type="text" name="number" value="${product.number}"></td>
    </tr>
    <tr>
        <td>color</td>
        <td><input type="text" name="color" value="${product.color}"></td>
    </tr>
    <tr>
        <td>mota</td>
        <td><input type="text" name="mota" value="${product.mota}"></td>
    </tr>
    <tr>
        <td>danh_sach</td>
        <td><input type="text" name="danh_sach" value="${product.danh_sach}"></td>
    </tr>
    <tr>
        <td></td>
        <td><button>Edit</button></td>
    </tr>
</form>
</body>
</html>
