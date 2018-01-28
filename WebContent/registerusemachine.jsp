<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.*"%>
<%@page import="model.bo.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register use machines</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        <div id="createc1">
			<form class="form" action="SuDungMayServlet" method="POST">
				<table>
					<h1>Create new use machine</h1>
					<tr>
						<td>
							Khách hàng:							
						</td>
						<td>
							<select name="makhachhang">
								<option value="">---Choice customers---</option>
								<%
									ArrayList<KhachHang> listkhachhang = (ArrayList<KhachHang>)request.getAttribute("listkhachhang");  
									for(KhachHang kh: listkhachhang){
								%>
									<option value="<%=kh.getMaKH()%>"><%=kh.getMaKH()%> - <%=kh.getTenKH()%></option>
								<%
									} 
								%>
							</select>
						</td>
					</tr>
					
					<tr>
						<td>
							Máy:
						</td>
						<td>
							<select name="mamay">
								<option value="">---Choice code machines---</option>
								<%
									ArrayList<May> listMay = (ArrayList<May>)request.getAttribute("listMay");  
									for(May dv: listMay){
								%>
									<option value="<%=dv.getMaMay()%>"><%=dv.getMaMay()%></option>
								<%
									} 
								%>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							Ngày bắt đầu sử dụng:
						</td>
						<td>
							<input type="text" name="ngaybatdausudung">
							 <!--nho bo text, bo date no loi-->
						</td>
					</tr>
					<tr>
						<td>
							Giờ bắt đầu sử dụng:
						</td>
						<td>
							<input type="time" name="giobatdausudung">
						</td>
					</tr>
					<tr>
						<td>
							Thời gian sử dụng:
						</td>
						<td>
							<input type="time" name="thoigiansudung">
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