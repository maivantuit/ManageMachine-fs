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
 * Servlet implementation class UpdateCustomersServlet
 */
public class UpdateCustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomersServlet() {
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
		KhachHangBO khachHangBo= new KhachHangBO();
		String mkh = request.getParameter("mkh"); // Su dung 2 noi: click update, 2: request.getparameter("maKhachHang") from input.							
		if("submit".equals(request.getParameter("submit"))){
			String tenKhachHang = request.getParameter("tenKhachHang");
			String diaChi = request.getParameter("diaChi");
			String soDienThoai = request.getParameter("soDienThoai");
			String email = request.getParameter("email");
			khachHangBo.updateCustomer(mkh, tenKhachHang, diaChi, soDienThoai, email);
			response.sendRedirect("DanhSachKhachHangServlet2");
		}else{
			KhachHang khachHang = khachHangBo.getThongTinKhachHang(mkh);
			request.setAttribute("khachHang", khachHang);
			RequestDispatcher rd = request.getRequestDispatcher("updatecustomers.jsp");
			rd.forward(request, response);
		}		
		
	}

}
