package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.KhachHang;
import model.bo.KhachHangBO;

/**
 * Servlet implementation class DanhSachKhachHangServlet2
 */
public class DanhSachKhachHangServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DanhSachKhachHangServlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		KhachHangBO khb = new KhachHangBO();
		// lay danh sach khach hang:
		ArrayList<KhachHang> listkhachhang2 = khb.getListKhachHang();
		request.setAttribute("listkhachhang2", listkhachhang2);
		// finally:
		RequestDispatcher rd = request
				.getRequestDispatcher("enumlistcustomers.jsp");
		rd.forward(request, response);
	}

}
