package model.bo;

import model.dao.SuDungDichVuDAO;

public class SuDungDichVuBO {
	SuDungDichVuDAO sddvd = new SuDungDichVuDAO();
	public boolean insertUseServices(String maKH, String maDV, String ngaySuDung, String gioSuDung,String soLuong){
		return sddvd.insertUseServices(maKH, maDV, ngaySuDung, gioSuDung, soLuong);
	}
}
