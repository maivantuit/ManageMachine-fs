<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create new customers</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        <div id="createc1">
			<form class="form" action="KhachHangServlet" method="POST">
				<table>
					<h1>Create new customer</h1>
					<tr>
						<td>
							Mã khách hàng:							
						</td>
						<td>
							<input type="text" name="makhachhang">
						</td>
					</tr>
					<tr>
						<td>
							Tên khách hàng:							
						</td>
						<td>
							<input type="text" name="tenkhachhang">
						</td>
					</tr>
					<tr>
						<td>
							Địa chỉ:
						</td>
						<td>
							<input type="text" name="diachi">
						</td>
					</tr>
					<tr>
						<td>
							Số điện thoại:
						</td>
						<td>
							<input type="text" name="sodienthoai">
						</td>
					</tr>
					<tr>
						<td>
							Email:
						</td>
						<td>
							<input type="text" name="email">
						</td>
					</tr>
					<tr id="bt">		
						<td>
														
						</td>					
						<td>
							<button type="submit" value="submit" name="submit">Create new</button>
						</td>
					</tr>
				</table>
			</form>
		</div>	
        <%@ include file="footer.jsp" %>
</body>
</html>