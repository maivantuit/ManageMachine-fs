package model.bo;

import java.util.ArrayList;

import model.bean.Services;
import model.dao.ServicesDAO;

public class ServicesBO {
	ServicesDAO sd = new ServicesDAO();
	public void insertServices(String maDV, String tenDV, String donViTinh, String donGia){
		sd.insertServices(maDV, tenDV, donViTinh, donGia);
	}
	public ArrayList<Services> getListServices(){
		return sd.getListDichVu();
	}
	public ArrayList<Services> getMaDVANDTenDV(){
		return sd.getMaDVANDTenDV();
	}
}
