package model.bean;

public class Services {
	private String maDV;
	private String tenDV;
	private String donViTinh;
	private String donGia;
	/**
	 * 
	 */
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maDV
	 * @param tenDV
	 * @param donViTinh
	 * @param donGia
	 */
	public Services(String maDV, String tenDV, String donViTinh, String donGia) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.donViTinh = donViTinh;
		this.donGia = donGia;
	}
	/**
	 * @return the maDV
	 */
	public String getMaDV() {
		return maDV;
	}
	/**
	 * @param maDV the maDV to set
	 */
	public void setMaDV(String maDV) {
		this.maDV = maDV;
	}
	/**
	 * @return the tenDV
	 */
	public String getTenDV() {
		return tenDV;
	}
	/**
	 * @param tenDV the tenDV to set
	 */
	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}
	/**
	 * @return the donViTinh
	 */
	public String getDonViTinh() {
		return donViTinh;
	}
	/**
	 * @param donViTinh the donViTinh to set
	 */
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	/**
	 * @return the donGia
	 */
	public String getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}	
	
	
}