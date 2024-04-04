package Model;

public class Sach extends Document {
	 private String tenTacGia;
	 private int soTrang;

	 public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
	     super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
	     this.tenTacGia = tenTacGia;
	     this.soTrang = soTrang;
	 }

	 public String getTenTacGia() {
	     return tenTacGia;
	 }

	 public int getSoTrang() {
	     return soTrang;
	 }

	 @Override
	 public void hienThiThongTin() {
	     System.out.println("Thông tin sách:");
	     System.out.println("Mã tài liệu: " + getMaTaiLieu());
	     System.out.println("Tên nhà xuất bản: " + getTenNhaXuatBan());
	     System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
	     System.out.println("Tên tác giả: " + tenTacGia);
	     System.out.println("Số trang: " + soTrang);
	 }
	}
