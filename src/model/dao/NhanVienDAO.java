package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.KhachHang;
import model.bean.NhanVien;
import connection.DBConnect;

public class NhanVienDAO {
	//1. get table nhan vien	
		public ArrayList<NhanVien> getListNhanVien(){
			Connection con = DBConnect.getConnection();
			String sql = "select MaNV,LoaiNhanVien.MaLoaiNV, TenNV,DiaChi,SoDienThoai,TenLoaiNhanVien from NhanVien join LoaiNhanVien on NhanVien.MaLoaiNV = LoaiNhanVien.MaLoaiNV";
			ArrayList<NhanVien> list = new ArrayList<NhanVien>();
			ResultSet rs;
			try {
				PreparedStatement pstmt = con.prepareCall(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					NhanVien kh = new NhanVien();
					kh.setMaNV(rs.getString("MaNV"));
					kh.setTenNV(rs.getString("TenNV"));
					kh.setDiaChi(rs.getString("DiaChi"));
					kh.setSoDienThoai(rs.getString("SoDienThoai"));
					kh.setTenLoaiNV(rs.getString("TenLoaiNhanVien"));
					kh.setMaLoaiNV(rs.getString("MaLoaiNV"));
					list.add(kh);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
	
		// 2. get ma loainv and ten tenloainhan:
		public ArrayList<NhanVien> getMaLNVAndTenLNV(){
			Connection con = DBConnect.getConnection();
			String sql = "select MaLoaiNV,TenLoaiNhanVien from LoaiNhanVien";
			ResultSet rs=null;
			try {
				Statement stmt = con.createStatement();
				rs= stmt.executeQuery(sql);
			} catch (Exception e) {
				e.printStackTrace();
			}
			ArrayList<NhanVien> list = new ArrayList<NhanVien>();
			try {			
				while(rs.next()){
					NhanVien kh = new NhanVien();
					kh.setMaLoaiNV(rs.getString("MaLoaiNV"));
					kh.setTenLoaiNV(rs.getString("TenLoaiNhanVien"));				
					list.add(kh);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
		// 3. get a record nhanvien from table nhanvien:
		public ArrayList<NhanVien> getThongTinNhanVien(String mlnv){
			Connection con  = DBConnect.getConnection();
			String sql = String.format("select MaNV,TenNV,DiaChi,SoDienThoai from NhanVien where MaLoaiNV = '%s'", mlnv);
			ResultSet rs = null;
			try {
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
			} catch (SQLException e) {			
				e.printStackTrace();
			}
			ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();			
			try {
				while(rs.next()){
					NhanVien nhanVien = new NhanVien();
					nhanVien.setMaNV(rs.getString("MaNV"));
					nhanVien.setTenNV(rs.getString("TenNV"));
					nhanVien.setDiaChi(rs.getString("DiaChi"));
					nhanVien.setSoDienThoai(rs.getString("SoDienThoai"));	
					listNhanVien.add(nhanVien);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return listNhanVien;
		}
		
		public static void main(String[] args) {			
			NhanVienDAO nvd = new NhanVienDAO();
			ArrayList<NhanVien> list =nvd.getThongTinNhanVien("LNV01");
			if(list!=null){
				for(NhanVien nv : list){
					System.out.println(nv.getTenNV());
				}
			}else{
				System.out.println("not oke");
			}
			
		}
}
