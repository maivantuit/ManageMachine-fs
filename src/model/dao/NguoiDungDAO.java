package model.dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import connection.DBConnect;

public class NguoiDungDAO {
	public boolean loginAccout(String id, String password){
		Connection con = DBConnect.getConnection();
		String sql = String.format("SELECT id FROM NguoiDung WHERE id = '%s' AND password = '%s'", id,password);
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
			if(rs.next()){
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) {
		boolean check = new NguoiDungDAO().loginAccout("cop", "123");
		if(check){
			System.out.println("oke men");
		}else{
			System.out.println("no men");
		}
	}
}
