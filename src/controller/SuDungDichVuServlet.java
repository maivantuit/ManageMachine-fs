package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.SuDungDichVuBO;

/**
 * Servlet implementation class SuDungDichVuServlet
 */
public class SuDungDichVuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuDungDichVuServlet() {
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
		
		// get data from form register use services:
		if("submit".equals(request.getParameter("submit"))){
			SuDungDichVuBO sddvb = new SuDungDichVuBO();
			String makhachhang= request.getParameter("makhachhang");
			String madichvu= request.getParameter("madichvu");
			String ngaysudung= request.getParameter("ngaysudung");
			String giosudung= request.getParameter("giosudung");
			String soluong= request.getParameter("soluong");
			boolean check=sddvb.insertUseServices(makhachhang, madichvu, ngaysudung, giosudung, soluong);
			if(check){
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("DanhSachKhachHangServlet");
				rd.forward(request, response);
			}			
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("DanhSachKhachHangServlet");
			rd.forward(request, response);
		}
		
				
	}

}
