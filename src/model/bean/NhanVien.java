package model.bean;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private String maLoaiNV;
	private String tenLoaiNV;	
	private String diaChi;
	private String soDienThoai;
	/**
	 * 
	 */
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param maNV
	 * @param tenNV
	 * @param maLNV
	 * @param diaChi
	 * @param soDienThoai
	 */
	public NhanVien(String maNV, String tenNV, String tenLoaiNV, String diaChi,
			String soDienThoai, String maLoaiNV) {
		super();
		this.maNV = maNV;
		this.maLoaiNV = maLoaiNV;
		this.tenNV = tenNV;
		this.tenLoaiNV = tenLoaiNV;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	/**
	 * @return the maNV
	 */
	public String getMaNV() {
		return maNV;
	}
	/**
	 * @param maNV the maNV to set
	 */
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	/**
	 * @return the tenNV
	 */
	public String getTenNV() {
		return tenNV;
	}
	/**
	 * @param tenNV the tenNV to set
	 */
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	/**
	 * @return the maLoaiNV
	 */
	public String getMaLoaiNV() {
		return maLoaiNV;
	}
	/**
	 * @param maLoaiNV the maLoaiNV to set
	 */
	public void setMaLoaiNV(String maLoaiNV) {
		this.maLoaiNV = maLoaiNV;
	}
	/**
	 * @return the tenLoaiNV
	 */
	public String getTenLoaiNV() {
		return tenLoaiNV;
	}
	/**
	 * @param tenLoaiNV the tenLoaiNV to set
	 */
	public void setTenLoaiNV(String tenLoaiNV) {
		this.tenLoaiNV = tenLoaiNV;
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
	
}
