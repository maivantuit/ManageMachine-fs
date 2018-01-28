<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Enum list machine</title>
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
		<% 
			MayBO mb = new MayBO();
			ArrayList<May> listmay = mb.getListMay();
		
		%>
		
		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        <div id="table-may">
			<table>
				<h1>List machine</h1>
				<span>Tìm kiếm</span><input type="text" placeholder="Search..">
				<tr>
					<th>Mã máy</th>
					<th>Ví trí</th>
					<th>Trạng thái</th>
					<th>Chức năng</th>
				</tr>
				<%
				for(May m : listmay){
				%>
				<tr>
					<td><%=m.getMaMay()%></td>
					<td><%=m.getViTri()%></td>
					<td><%=m.getTrangThai()%></td>
					<td>											
						<a href="">Delete</a>
						<a href="">Update</a>
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