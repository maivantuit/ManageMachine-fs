package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.ServicesBO;

/**
 * Servlet implementation class ServicesServlet
 */
public class ServicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServicesServlet() {
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
		ServicesBO sb = new ServicesBO();
		// khi nhan but submit:
		String madichvu = request.getParameter("madichvu");
		String tendichvu = request.getParameter("tendichvu");
		String donvitinh = request.getParameter("donvitinh");
		String dongia = request.getParameter("dongia");
		if("submit".equals(request.getParameter("submit"))){
			sb.insertServices(madichvu, tendichvu, donvitinh, dongia);
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("createnewservices.jsp");
			rd.forward(request, response);
		}
	}

}
