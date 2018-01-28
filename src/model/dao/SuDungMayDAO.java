package model.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import connection.DBConnect;

public class SuDungMayDAO {
	// insert a record into table SuDungMay:
		public boolean insertUseMachine(String maKH, String maMay, String ngayBatDauSuDung, String gioBatDauSuDung,String thoiGianSuDung){
			Connection con = DBConnect.getConnection();
			String sql=null;
			try {
				SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		        java.util.Date parsed = d.parse(ngayBatDauSuDung);
		        java.sql.Date sq = new java.sql.Date(parsed.getTime());	
		        sql = String.format("insert into SuDungMay(MaKH,MaMay,NgayBatDauSuDung,GioBatDauSuDung,ThoiGianSuDung) values('%s','%s','%s','%s','%s')", maKH,maMay,sq,gioBatDauSuDung,thoiGianSuDung);
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
}
