package controller;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.DanhSachTatCa;
import model.bo.DanhSachTatCaBO;

/**
 * Servlet implementation class DanhSachTatCaServlet
 */
public class DanhSachTatCaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachTatCaServlet() {
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
		// get list all from listall.jsp:
		DanhSachTatCaBO dstcb = new DanhSachTatCaBO();
		Vector<DanhSachTatCa> listall=dstcb.getListAll();
		request.setAttribute("listall", listall);
		
		RequestDispatcher rd = request.getRequestDispatcher("listall.jsp");
		rd.forward(request, response);
	}

}
