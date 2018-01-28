<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<title>Login</title>
		
</head>
<body>
 		<%@ include file="header.jsp" %>
        <%@ include file="menu.jsp" %>
        <div class="account">
                <h2 >Login</h2>
                <form action="DangNhapServlet" method="POST">                    
                    <div >
                        <span>Username </span>
                        <input type="text" name="id">
                    </div > 	                        
                    <div > 
                        <span >Password* </span>
                        <input type="password" name="pass">
                    </div>			
                    <% if(request.getAttribute("loi") != null){%>
                    <div>
                        <p style="color:white">(*) Vui lòng kiểm tra lại id và password</p>
                    </div> 
                    <%}%>
                    <button type="submit" name="submit" value="submit">Login</button>                     
                </form>               
            </div>
        <%@ include file="footer.jsp" %>
        <%--test commit, comtributions git--%>
</body>
</html>