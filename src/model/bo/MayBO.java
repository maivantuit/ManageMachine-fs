package model.bo;

import java.util.ArrayList;

import model.bean.May;
import model.dao.MayDAO;

public class MayBO {
	MayDAO md = new MayDAO();
	public void insertMay(String maMay, String viTri, String trangThai){
		md.insertMay(maMay, viTri, trangThai);
	}
	
	public ArrayList<May> getListMay(){
		return md.getListMay();
	}
	
	public ArrayList<May> getMaMayAtDAO(){
		return md.getMaMayAtDAO();
	}
}
