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
		
		
		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        <div id="table-may">
        	<h1>Danh sách nhân viên</h1>	
        	<form action="DanhSachNhanVienServlet" method="post">
        		<div>
        			<select name="maLoaiNhanVien">
        				<option value="">--Select Staff Type--</option>
        				<%
        					ArrayList<NhanVien> listNhanVien = (ArrayList<NhanVien>) request.getAttribute("listNhanVien");
        					for(NhanVien nhanVien : listNhanVien){
        				%>
        					<option value="<%= nhanVien.getMaLoaiNV() %>"><%=nhanVien.getMaLoaiNV() %> - <%= nhanVien.getTenLoaiNV() %></option>
        				<%
        					}
        				%>
        			</select>
        		</div>
        		<button type="submit">Xem</button>
        	</form>
			<table>										
				<tr>
					<th>Mã nhân viên</th>
					<th>Tên nhân viên</th>					
					<th>Số điện thoại</th>
					<th>Địa Chỉ</th>
					<th>Chức năng</th>
				</tr>
				<%			
					ArrayList<NhanVien> listNhanVien2 = (ArrayList<NhanVien>) request.getAttribute("listNhanVienFull");						
					for(NhanVien kh : listNhanVien2){									
				%>
				<tr>
					<td><%= kh.getMaNV() %></td>
					<td><%= kh.getTenNV() %></td>
					<td><%= kh.getSoDienThoai()%></td>
					<td><%= kh.getDiaChi()%></td>					
					<td>											
						<a href="#">Update</a>
						<a href="#">Delete</a>
					</td>
				</tr>
				<% 
					}
				%>
				
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