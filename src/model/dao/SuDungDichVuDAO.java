package model.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;

import connection.DBConnect;

public class SuDungDichVuDAO {
	// insert a record into table May:
	public boolean insertUseServices(String maKH, String maDV, String ngaySuDung, String gioSuDung,String soLuong){
		Connection con = DBConnect.getConnection();
		String sql=null;
		try {
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
	        java.util.Date parsed = d.parse(ngaySuDung);
	        java.sql.Date sq = new java.sql.Date(parsed.getTime());	
	        sql = String.format("insert into SuDungDichVu(MaKH,MaDV,NgaySuDung,GioSuDung,SoLuong) values('%s','%s','%s','%s','%s')", maKH,maDV,sq,gioSuDung,soLuong);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args) {
		SuDungDichVuDAO s = new SuDungDichVuDAO();
		boolean check =s.insertUseServices("KH01", "DV01", "03/02/2018", "7:00 AM", "9");
		if(check){
			System.out.println("ok");
		}else{
			System.out.println("not ok");
		}
	}
}
