package model.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.KhachHang;
import model.bean.Services;

import connection.DBConnect;

public class ServicesDAO {
	// insert a record into table May:
	public void insertServices(String maDV, String tenDV, String donViTinh, String donGia){
		Connection con = DBConnect.getConnection();
		String sql = String.format("insert into DichVu(MaDV,TenDV,DonViTinh,DonGia) values('%s',N'%s',N'%s','%s')", maDV,tenDV,donViTinh,donGia);
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// get list services from table DichVu:
	public ArrayList<Services> getListDichVu(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from DichVu";
		ArrayList<Services> list = new ArrayList<Services>();
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				Services kh = new Services();
				kh.setMaDV(rs.getString("MaDV"));
				kh.setTenDV(rs.getString("TenDV"));
				kh.setDonViTinh(rs.getString("DonViTinh"));
				kh.setDonGia(rs.getString("DonGia"));				
				list.add(kh);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	//  get ma dichvu and ten dichvu:
	public ArrayList<Services> getMaDVANDTenDV(){
		Connection con = DBConnect.getConnection();
		String sql = "select MaDV,TenDV from DichVu";
		ResultSet rs=null;
		try {
			Statement stmt = con.createStatement();
			rs= stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Services> list = new ArrayList<Services>();
		try {			
			while(rs.next()){
				Services kh = new Services();
				kh.setMaDV(rs.getString("MaDV"));
				kh.setTenDV(rs.getString("TenDV"));				
				list.add(kh);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void main(String[] args) {
		ServicesDAO sd = new ServicesDAO();
		//sd.insertServices("DV02", "Sua", "Hop", "8000");
		ArrayList<Services> list = new ArrayList<Services>();
		list = sd.getMaDVANDTenDV();
		for(Services s : list){
			System.out.println(s.getMaDV()+" "+s.getTenDV() );
		}
	}
}
