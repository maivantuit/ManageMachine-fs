package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.SuDungMayBO;

/**
 * Servlet implementation class SuDungMayServlet
 */
public class SuDungMayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuDungMayServlet() {
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
		
		// khi nhan submit register use may from form register use machine:
		if("submit".equals(request.getParameter("submit"))){
			SuDungMayBO sdmb = new SuDungMayBO();
			String makhachhang = request.getParameter("makhachhang");
			String mamay = request.getParameter("mamay");
			String ngaybatdausudung = request.getParameter("ngaybatdausudung");
			String giobatdausudung = request.getParameter("giobatdausudung");
			String thoigiansudung = request.getParameter("thoigiansudung");
			boolean check= sdmb.insertUseMachine(makhachhang, mamay, ngaybatdausudung, giobatdausudung, thoigiansudung);
			if(check){
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("SuDungMayServlet");
				rd.forward(request, response);
			}
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("SuDungMayServlet");
			rd.forward(request, response);
		}
		
		
	}

}		