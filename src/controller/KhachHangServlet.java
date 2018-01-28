package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.KhachHang;
import model.bo.KhachHangBO;

/**
 * Servlet implementation class KhachHangServlet
 */
public class KhachHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.setCharacterEncoding("UTF-8");
		KhachHangBO khachhangbo = new KhachHangBO();
		
		// neu nhan nut submit:
		if("submit".equals(request.getParameter("submit"))){
			String makhachhang = request.getParameter("makhachhang");
			String tenkhachhang = request.getParameter("tenkhachhang");
			String diachi = request.getParameter("diachi");
			String sodienthoai = request.getParameter("sodienthoai");
			String email = request.getParameter("email");
			khachhangbo.insertKhachHang(makhachhang, tenkhachhang, diachi, sodienthoai, email);	
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("createnewcustomers.jsp");
			rd.forward(request, response);
		}
	}

}
