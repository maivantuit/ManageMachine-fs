package model.bo;

import model.dao.SuDungMayDAO;

public class SuDungMayBO {
	SuDungMayDAO sdmd = new SuDungMayDAO();
	public boolean insertUseMachine(String maKH, String maMay, String ngayBatDauSuDung, String gioBatDauSuDung,String thoiGianSuDung){
		return sdmd.insertUseMachine(maKH, maMay, ngayBatDauSuDung, gioBatDauSuDung, thoiGianSuDung);
	}
}
