package model.bo;

import java.util.ArrayList;

import model.bean.KhachHang;
import model.dao.KhachHangDAO;

public class KhachHangBO {
	KhachHangDAO khd = new KhachHangDAO();
	
	public void insertKhachHang(String maKH, String tenKH, String diaChi,
			String soDienThoai, String email){
		khd.insertKhachHang(maKH,tenKH,diaChi,soDienThoai,email);
	}
	
	public ArrayList<KhachHang> getListKhachHang(){
		return khd.getListKhachHang();
	}
	
	public ArrayList<KhachHang> getMaKHANDTenKH(){
		return khd.getMaKHANDTenKH();
	}
	public boolean updateCustomer(String maKH, String tenKH, String diaChi,
			String soDienThoai, String email){
		return khd.updateCustomer(maKH, tenKH, diaChi, soDienThoai, email);
	}
	public KhachHang getThongTinKhachHang(String mkh){
		return khd.getThongTinKhachHang(mkh);
	}
}
