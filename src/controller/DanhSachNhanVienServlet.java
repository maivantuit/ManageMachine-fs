package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.NhanVien;
import model.bo.NhanVienBO;

/**
 * Servlet implementation class DanhSachNhanVienServlet
 */
public class DanhSachNhanVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachNhanVienServlet() {
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
		// lay danh sach maloainhanvien - tenloainhanvien:
		NhanVienBO nvb = new NhanVienBO();
		ArrayList<NhanVien> listNhanVien =nvb.getMaLNVAndTenLNV();
		request.setAttribute("listNhanVien",listNhanVien);		
		
		// lay danh sach nhan vien:		
		ArrayList<NhanVien> listNhanVienFull;
		String maLoaiNhanVien = request.getParameter("maLoaiNhanVien");
		if(maLoaiNhanVien == null || maLoaiNhanVien.length() ==0){
			 listNhanVienFull = nvb.getListNhanVien();			
		}else{x	
			 listNhanVienFull = nvb.getThongTinNhanVien(maLoaiNhanVien);
		}
		request.setAttribute("listNhanVienFull", listNhanVienFull);
		
		// finally:
		RequestDispatcher rd = request.getRequestDispatcher("DanhSachNhanVien.jsp");
		rd.forward(request, response);
	}

}
