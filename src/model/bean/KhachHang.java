package model.bean;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private String diaChi;
	private String soDienThoai;
	private String email;
	
	/**
	 * 
	 */
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}	
	/**
	 * @param maKH
	 * @param tenKH
	 * @param diaChi
	 * @param soDienThoai
	 * @param email
	 */
	public KhachHang(String maKH, String tenKH, String diaChi,
			String soDienThoai, String email) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
	}

	/**
	 * @return the maKH
	 */
	public String getMaKH() {
		return maKH;
	}
	/**
	 * @param maKH the maKH to set
	 */
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	/**
	 * @return the tenKH
	 */
	public String getTenKH() {
		return tenKH;
	}
	/**
	 * @param tenKH the tenKH to set
	 */
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}
	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
