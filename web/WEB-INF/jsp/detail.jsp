<%-- 
    Document   : newjspdetail
    Created on : Oct 17, 2017, 1:46:26 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class="table table-inverse">
            <tbody>
                <tr>
                    <td></br></br></br></br><h1>${produkDetail.nama}</h1></td>
        
               
        <td><img src="${produkDetail.gambar}.jpg" alt="gambar" width="180" height="250"/></td>
        <td></br></br></br></br><h1>${produkDetail.harga}</h1></td>
        <td></br></br></br></br><a href="tambahkan"><button type="submit">Tambahkan ke keranjang</button></a></td>
    </tr></tbody>
            <tfoot>
                <tr>
                    <td colspan="5" class="text-center">${produkDetail.keterangan}</td>
                </tr>
            </tfoot>
        </table>
    </body>
</html>
