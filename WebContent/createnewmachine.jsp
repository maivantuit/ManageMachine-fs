<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Create new machine</title>
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<%@ include file="header.jsp" %>
    <%@ include file="menu.jsp" %>
    	
		<div id="createc1">
			<form class="form" action="MayServlet" method="post">
				<table>
					<h1>Create new machine</h1>
					<tr>
						<td>
							Mã máy:							
						</td>
						<td>
							<input type="text" name="mamay">
						</td>
					</tr>
					<tr>
						<td>
							Vị trí:							
						</td>
						<td>
							<input type="text" name="vitri">
						</td>
					</tr>
					<tr>
						<td>
							Trạng thái:							
						</td>
						<td>
							<input type="text" name="trangthai">
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