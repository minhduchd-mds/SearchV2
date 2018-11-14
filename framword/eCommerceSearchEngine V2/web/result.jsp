<%-- 
    Document   : result
    Created on : 14-11-2018, 00:49:40
    Author     : dominhduc
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
        <h1>List Prodiuct </h1>
        <a href="Search.jsp">Search</a>
        <jsp:useBean class="com.fpt.model.ProductFinderBean" id="finder" scope="request"/>
        <table>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Description</td>
            </tr>
            <c:forEach items="${finder.products}" var="products">
                <tr>
                    <td><c:out value="${product.id}"/></td>                
                    <td><c:out value="${product.name}"/></td>
                    <td><c:out value="${product.desc}"/></td>
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>
