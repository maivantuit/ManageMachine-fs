package model.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connection.DBConnect;

import model.bean.KhachHang;

public class KhachHangDAO {
	//1. insert a record into database table KhachHang
	public void insertKhachHang(String maKH, String tenKH, String diaChi,
			String soDienThoai, String email){
		Connection con = DBConnect.getConnection();
		String sql = String.format("insert into KhachHang values('%s',N'%s','%s','%s','%s')",maKH, tenKH,diaChi,soDienThoai,email);
		try {
			Statement stmt = con.createStatement();		
			stmt.executeUpdate(sql);
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
	// 2. get list customers from table KhachHang:
	public ArrayList<KhachHang> getListKhachHang(){
		Connection con = DBConnect.getConnection();
		String sql = "select * from KhachHang";
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		ResultSet rs;
		try {
			PreparedStatement pstmt = con.prepareCall(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				KhachHang kh = new KhachHang();
				kh.setMaKH(rs.getString("MaKH"));
				kh.setTenKH(rs.getString("TenKH"));
				kh.setDiaChi(rs.getString("DiaChi"));
				kh.setSoDienThoai(rs.getString("SoDienThoai"));
				kh.setDiaChi(rs.getString("DiaChiEmail"));
				list.add(kh);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 3. get ma khachhang and ten khachhang:
	public ArrayList<KhachHang> getMaKHANDTenKH(){
		Connection con = DBConnect.getConnection();
		String sql = "select MaKH,TenKH from KhachHang";
		ResultSet rs=null;
		try {
			Statement stmt = con.createStatement();
			rs= stmt.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		try {			
			while(rs.next()){
				KhachHang kh = new KhachHang();
				kh.setMaKH(rs.getString("MaKH"));
				kh.setTenKH(rs.getString("TenKH"));				
				list.add(kh);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 4. update customers in table KhachHang:
	public boolean updateCustomer(String maKH, String tenKH, String diaChi,
			String soDienThoai, String email){
		Connection con = DBConnect.getConnection();
		String sql = String.format("update KhachHang " +
				"set TenKH = N'%s', DiaChi = N'%s', SoDienThoai = '%s',DiaChiEmail ='%s' " +
				"where MaKH = '%s'",tenKH,diaChi,soDienThoai,email,maKH);
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	// 5. get a record customers from table KhachHang:
	public KhachHang getThongTinKhachHang(String mkh){
		Connection con  = DBConnect.getConnection();
		String sql = String.format("select MaKH, TenKH,DiaChi,SoDienThoai,DiaChiEmail from KhachHang where MaKH = '%s'", mkh);
		ResultSet rs = null;
		try {
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		KhachHang khachHang = new KhachHang();
		try {
			while(rs.next()){
				khachHang.setMaKH(mkh);
				khachHang.setTenKH("TenKH");
				khachHang.setDiaChi("DiaChi");
				khachHang.setEmail("SoDienThoai");
				khachHang.setEmail("DiaChiEmail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return khachHang;
	}
	
	
	public static void main(String[] args) {
		KhachHangDAO khd = new KhachHangDAO();
		//khd.insertKhachHang("KH012","Nguyen Huu Ty","Quang Binh","0948428281","ty@gmail.com");
		
		/*ArrayList<KhachHang> list2 =  khd.getMaKHANDTenKH();
		for(KhachHang kh: list2){
			System.out.println(kh.getMaKH()+" "+kh.getTenKH());
		}
		khd.updateCustomer("KH01", "Mai Văn Tú", "Quảng Trị", "098888888", "tutu@gmail.com");
		*/
		
		KhachHang kh1 = khd.getThongTinKhachHang("KH01");
		if(kh1 !=null){
			System.out.println("Oke");
		}else{
			System.out.println("Not oke");
		}
		
	}
}
