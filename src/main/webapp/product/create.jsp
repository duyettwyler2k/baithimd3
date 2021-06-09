<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>Create new product</h1>
<a href="/products">List Product</a>
<form method="post">
    <tr>
        <td>name</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>price</td>
        <td><input type="text" name="price"></td>
    </tr>
    <tr>
        <td>number</td>
        <td><input type="text" name="number"></td>
    </tr>
    <tr>
        <td>color</td>
        <td><input type="text" name="color"></td>
    </tr>
    <tr>
        <td>mota</td>
        <td><input type="text" name="mota"></td>
    </tr>
    <tr>
        <td>danh_sach</td>
        <td><input type="text" name="danh_sach"></td>
    </tr>
<tr>
<td></td>
<td><button>Create</button></td>
</tr>

</form>
</body>
</html>
