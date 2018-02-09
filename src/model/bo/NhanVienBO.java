package model.bo;

import java.util.ArrayList;

import model.bean.NhanVien;
import model.dao.NhanVienDAO;

public class NhanVienBO {
	NhanVienDAO nvd = new NhanVienDAO();
	public ArrayList<NhanVien> getListNhanVien(){
		return nvd.getListNhanVien();		
	}
	public ArrayList<NhanVien> getMaLNVAndTenLNV(){
		return nvd.getMaLNVAndTenLNV();	
	}
	
	public ArrayList<NhanVien> getThongTinNhanVien(String mlnv){
		return nvd.getThongTinNhanVien(mlnv);
	}
}
