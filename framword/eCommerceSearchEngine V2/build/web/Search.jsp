<%-- 
    Document   : Search
    Created on : 14-11-2018, 00:49:27
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
         <form action="ProductFinder">
             <span style="color: red;">
                 <c:out value="${param.msg}" />
                 <input name="name"/><input type="submit"/>
                 
             </span>
        </form>
    </body>
</html>
