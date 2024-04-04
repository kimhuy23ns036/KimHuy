package Model;

//TapChi.java
public class TapChi extends Document {
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin tạp chí:");
		System.out.println("Mã tài liệu: " + getMaTaiLieu());
		System.out.println("Tên nhà xuất bản: " + getTenNhaXuatBan());
		System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
		System.out.println("Số phát hành: " + soPhatHanh);
		System.out.println("Tháng phát hành: " + thangPhatHanh);
	}
}
