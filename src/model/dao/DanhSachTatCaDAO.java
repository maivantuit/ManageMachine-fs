package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import model.bean.DanhSachTatCa;

import connection.DBConnect;

public class DanhSachTatCaDAO {
	// get all:
	public Vector<DanhSachTatCa> getListAll(){
		Connection con = DBConnect.getConnection();
		String sql = "select KhachHang.MaKH,TenKH,May.MaMay,ViTri,TrangThai,NgayBatDauSuDung," +
				"GioBatDauSuDung,ThoiGianSuDung,DichVu.MaDV,NgaySuDung,GioSuDung,SoLuong,DichVu.DonGia*SoLuong as TongTien from KhachHang join SuDungMay on KhachHang.MaKH = SuDungMay.MaKH join SuDungDichVu on KhachHang.MaKH = SuDungDichVu.MaKH join DichVu on DichVu.MaDV = SuDungDichVu.MaDV join May on May.MaMay = SuDungMay.MaMay";
		Vector<DanhSachTatCa> list = new Vector<DanhSachTatCa>();
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				DanhSachTatCa v = new DanhSachTatCa();
				v.setMaKH(rs.getString("MaKH"));
				v.setTenKH(rs.getString("TenKH"));
				v.setMaMay(rs.getString("MaMay"));
				v.setViTri(rs.getString("ViTri"));
				v.setTrangThai(rs.getString("TrangThai"));
				v.setNgayBatDauSuDung(rs.getString("NgayBatDauSuDung"));
				v.setGioBatDauSuDung(rs.getString("GioBatDauSuDung"));
				v.setThoiGianSuDung(rs.getString("ThoiGianSuDung"));
				v.setMaDV(rs.getString("MaDV"));
				v.setNgaySuDung(rs.getString("NgaySuDung"));
				v.setGioSuDung(rs.getString("GioSuDung"));
				v.setSoLuong(rs.getString("SoLuong"));				
				v.setTongTien(rs.getString("TongTien"));
				list.add(v);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		DanhSachTatCaDAO all = new DanhSachTatCaDAO();
		Vector<DanhSachTatCa> listall =all.getListAll();
		for(DanhSachTatCa element: listall){
			System.out.println(element.getMaKH());
		}
	}
}
