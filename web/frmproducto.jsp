
<%-- 
    Document   : frmproducto
    Created on : 02-06-2020, 07:38:30 PM
    Author     : Sergio
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <c:if test="${producto.id==0}">Nuevo</c:if> 
            <c:if test="${producto.id!=0}" >Editar</c:if>
                Producto
            </h1>
            <form action="inicio" method="post">
                <input type="hidden" name="id" value="${producto.id}" />
            <table>
                <tr>
                    <td>DESCRIPCION:</td>
                    <td><textarea name="descripcion" rows="4" cols="20">
                            ${producto.descripcion}
                        </textarea></td>
                </tr>
                <tr><td>STOCK:</td>
                    <td><input type="text" name="stock" value="${producto.stock}"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td> <input type="submit"></td>
                </tr>

            </table>

        </form>
    </body>
</html>
