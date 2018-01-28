package model.bo;

import model.dao.NguoiDungDAO;

public class NguoiDungBO {
	NguoiDungDAO ndd = new NguoiDungDAO();
	
	public boolean loginAccout(String id, String password){
		return ndd.loginAccout(id, password);
	}
}
