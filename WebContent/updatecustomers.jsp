<%@page import="model.bean.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update customers</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>

		<%
			KhachHang khachHang = (KhachHang)request.getAttribute("khachHang");
		%>
		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        <div id="createc1">
			<form class="form" action="UpdateCustomersServlet" method="POST">
				<table>
					<h1>Update customer</h1>
					<tr>
						<td>
							Mã khách hàng:							
						</td>
						<td>
							<input value="<%= khachHang.getMaKH()%>" type="text" readonly="readonly" name="mkh">
						</td>
					</tr>
					<tr>
						<td>
							Tên khách hàng:							
						</td>
						<td>
							<input value="<%= khachHang.getTenKH()%>" type="text" name="tenKhachHang">
						</td>
					</tr>
					<tr>
						<td>
							Địa chỉ:
						</td>
						<td>
							<input type="text" name="diaChi" value="<%= khachHang.getDiaChi()%>">
						</td>
					</tr>
					<tr>
						<td>
							Số điện thoại:
						</td>
						<td>
							<input type="text" value="<%= khachHang.getSoDienThoai()%>" name="soDienThoai">
						</td>
					</tr>
					<tr>
						<td>
							Email:
						</td>
						<td>
							<input type="text" value="<%= khachHang.getEmail()%>" name="email">
						</td>
					</tr>
					<tr id="bt">		
						<td>
														
						</td>					
						<td>
							<button type="submit" value="submit" name="submit">Update This Customers</button>
						</td>
					</tr>
				</table>
			</form>
		</div>	
        <%@ include file="footer.jsp" %>
</body>
</html>