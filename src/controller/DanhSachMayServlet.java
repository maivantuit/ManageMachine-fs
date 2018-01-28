package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.KhachHang;
import model.bean.May;
import model.bo.KhachHangBO;
import model.bo.MayBO;

/**
 * Servlet implementation class DanhSachMayServlet
 */
public class DanhSachMayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachMayServlet() {
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
		/*
		MayBO mb = new MayBO();
		ArrayList<May> listmay = mb.getListMay();
		request.setAttribute("listmay", listmay);
		*/
		
		// lay ma may:
		MayBO mb = new MayBO();
		ArrayList listMay = mb.getMaMayAtDAO();
		request.setAttribute("listMay", listMay);
		
		/*
		 * Lay 2 combobox cung 1 servlet!!!
		 * */
		
		// lay danh sach 2 gia tri makh, tenkh:
				KhachHangBO khb = new KhachHangBO();
				ArrayList<KhachHang> listkhachhang = khb.getMaKHANDTenKH();
				request.setAttribute("listkhachhang", listkhachhang);
				System.out.println(listkhachhang);		
		
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("registerusemachine.jsp");
		rd.forward(request, response);
	}

}
