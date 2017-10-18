<%-- 
    Document   : welcome
    Created on : Oct 17, 2017, 11:50:32 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>${Title}</title>
    </head>
    <body>
        <h3 style="text-align: center; position: relative">IGLO CINEMA</h3>
        <h3 style="text-align: right; right: 60px"><a href="isiKeranjang">Keranjang</a> : ${keranjang.size()}</h3>
        </br>
           
                            <table class="table table-bordered table-hover">
                                <thead style="background-color: #818182">
                                    <tr>
                                        <th>JUDUL</th>
                                        <th>HARGA</th>
                                    </tr>
                                </thead>
                                <tbody>
                                          <c:forEach items="${produk}" var="c">
                                    <tr>
                                        
                                        <td><a href="detail/${c.id}">${c.nama}</a></td>                        
                                        <td>${c.harga}</td>
                                    </tr>
                                       </c:forEach>
                                </tbody>
                            </table>
                        
     
    </body>
</html>
