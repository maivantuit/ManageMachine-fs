<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Enum list customers</title>
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
		<% 
			KhachHangBO khb = new KhachHangBO();
			ArrayList<KhachHang> listkhachhang = khb.getListKhachHang();		
		%>
		
		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        <div id="table-may">
			<table>
				<h1>List Customes</h1>
				<span>Tìm kiếm</span><input type="text" placeholder="Search..">
				<tr>
					<th>Mã khách hàng</th>
					<th>Tên khách hàng</th>
					<th>Địa chỉ</th>
					<th>Số điện thoại</th>
					<th>Địa chỉ email</th>
					<th>Chức năng</th>
				</tr>
				<%
					for(KhachHang kh : listkhachhang){
										
				%>
				<tr>
					<td><%= kh.getMaKH()%></td>
					<td><%= kh.getTenKH()%></td>
					<td><%= kh.getDiaChi()%></td>
					<td><%= kh.getSoDienThoai()%></td>
					<td><%= kh.getEmail()%></td>
					<td>											
						<a href="">Delete</a>
						<a href="">Update</a>
					</td>
				</tr>
				<%} %>
				
			</table>
			<div class="pagination">
			  <a href="#">&laquo;</a>
			  <a href="#">1</a>
			  <a href="#">2</a>
			  <a href="#">3</a>
			  <a href="#">4</a>
			  <a href="#">5</a>
			  <a href="#">6</a>
			  <a href="#">&raquo;</a>
			</div>
		</div>		
        <%@ include file="footer.jsp" %>
</body>
</html>