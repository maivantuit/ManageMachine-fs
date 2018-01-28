

<%@page import="model.bean.NguoiDung"%><div id="menu">
		<ul>
			<li><a href="index.jsp">Home</a></li>
			<li>
				<a href="#">Screen</a>
				<ul class="sub-menu2">
					<li><a href="createnewmachine.jsp">Create new machine</a></li>
					<li><a href="createnewcustomers.jsp">Create new customes</a></li>
					<li><a href="createnewservices.jsp">Create new services</a></li>
					<li><a href="enumlistmachine.jsp">Enum list machine</a></li>
					<li><a href="enumlistcustomers.jsp">Enum list customers</a></li>
					<li><a href="enumlistservices.jsp">Enum list services</a></li>
					<li><a href="DanhSachMayServlet">Register use machine</a></li>
					<li><a href="DanhSachKhachHangServlet">Register use services</a></li> 
					<!-- 
					1.Khi chay vao jsp, ma du lieu tu controller, nen jsp bi loi. ta chay vao thang vao controller => day qua view 
					2. chu y khi forward trong servlet toi 1 page jsp hay servlet nhe.
					-->
					
					<li><a href="DanhSachTatCaServlet">List all</a></li>
				</ul>
			</li>
			<li><a href="#">Other</a></li>
			<li><a href="login.jsp">Login</a></li>
			<li><a href="#">
			Welcome: 			
			</a></li>
		</ul>
	</div>
