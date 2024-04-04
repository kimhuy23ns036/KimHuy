package Model;

//Document.java
public abstract class Document {
	private String maTaiLieu;
	private String tenNhaXuatBan;
	private int soBanPhatHanh;

	public Document(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public abstract void hienThiThongTin();
}