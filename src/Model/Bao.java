package Model;

//Bao.java
public class Bao extends Document {
	private int ngayPhatHanh;

	public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Thông tin báo:");
		System.out.println("Mã tài liệu: " + getMaTaiLieu());
		System.out.println("Tên nhà xuất bản: " + getTenNhaXuatBan());
		System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
		System.out.println("Ngày phát hành: " + ngayPhatHanh);
	}
}
