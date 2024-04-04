package View;

//LibraryView.java
import java.util.Scanner;

public class LibraryView {
	private Scanner scanner;

	public LibraryView() {
		scanner = new Scanner(System.in);
	}

	public void hienThiMenu() {
		System.out.println("Menu Hệ thống quản lý thư viện:");
		System.out.println("1. Thêm mới tài liệu");
		System.out.println("2. Xoá tài liệu theo mã");
		System.out.println("3. Hiển thị thông tin về tài liệu");
		System.out.println("4. Tìm kiếm tài liệu theo loại");
		System.out.println("5. Thoát");
		System.out.print("Chọn một lựa chọn: ");
	}

	public String nhapLuaChon() {
		return scanner.nextLine();
	}

	public void hienThiThongBao(String thongBao) {
		System.out.println(thongBao);
	}
}
