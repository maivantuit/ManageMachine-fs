package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.May;

import connection.DBConnect;

public class MayDAO {
	// 2. insert a record into database table May:
	public void insertMay(String maMay, String viTri, String trangThai){
		Connection con = DBConnect.getConnection();
		String sql = String.format("insert into May(MaMay,ViTri,TrangThai) values('%s','%s','%s')", maMay,viTri,trangThai);
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// get list may from table May
	public ArrayList<May> getListMay(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from May";
		ArrayList<May> list = new ArrayList<May>();
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				May m = new May();
				m.setMaMay(rs.getString("MaMay"));
				m.setViTri(rs.getString("ViTri"));
				m.setTrangThai(rs.getString("TrangThai"));
				list.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		MayDAO md = new MayDAO();
		md.insertMay("M02", "2", "Off");
		
		ArrayList<May> list =md.getListMay();
		for(May ele: list){
			System.out.println(ele.getMaMay());
		}
	}
}
