package model.bo;

import java.util.Vector;

import model.bean.DanhSachTatCa;
import model.dao.DanhSachTatCaDAO;

public class DanhSachTatCaBO {
	DanhSachTatCaDAO dstcd = new DanhSachTatCaDAO();
	//
	public Vector<DanhSachTatCa> getListAll(){
		return dstcd.getListAll();
	}
}
