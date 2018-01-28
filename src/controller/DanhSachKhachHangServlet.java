package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.KhachHang;
import model.bean.Services;
import model.bo.KhachHangBO;
import model.bo.ServicesBO;

/**
 * Servlet implementation class DanhSachKhachHangServlet
 */
public class DanhSachKhachHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachKhachHangServlet() {
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
		// lay danh sach 2 gia tri makh, tenkh:
		KhachHangBO khb = new KhachHangBO();
		ArrayList<KhachHang> listkhachhang = khb.getMaKHANDTenKH();
		request.setAttribute("listkhachhang", listkhachhang);
		System.out.println(listkhachhang);		
		
		
		// lay danh sach madv tendv:
		ServicesBO svb = new ServicesBO();
		ArrayList<Services> listdichvu =svb.getMaDVANDTenDV();
		request.setAttribute("listdichvu",listdichvu);
		
		
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("registeruseservices.jsp");
		rd.forward(request, response);
	}

}
