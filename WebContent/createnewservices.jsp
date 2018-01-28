<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Create new services</title>
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        
		<div id="createc1">
			<form class="form" action="ServicesServlet" method="post">
				<table>
					<h1>Create new services</h1>
					<tr>
						<td>
							Mã dịch vụ:							
						</td>
						<td>
							<input type="text" name="madichvu">
						</td>
					</tr>
					<tr>
						<td>
							Tên dịch vụ:							
						</td>
						<td>
							<input type="text" name="tendichvu">
						</td>
					</tr>
					<tr>
						<td>
							Đơn vị tính
						</td>
						<td>
							<input type="text" name="donvitinh">
						</td>
					</tr>
					<tr>
						<td>
							Đơn giá
						</td>
						<td>
							<input type="text" name="dongia">
						</td>
					</tr>					
					<tr id="bt">		
						<td>
														
						</td>					
						<td>
							<button type="submit" value="submit" name="submit">Creare new</button>
						</td>
					</tr>
				</table>
			</form>
		</div>		
	
        <%@ include file="footer.jsp" %>
</body>
</html>