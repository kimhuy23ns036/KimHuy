package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Bao;
import Model.Document;
import Model.Sach;
import Model.TapChi;
import View.LibraryView;
import java.util.Scanner;

public class LibraryController {
 private List<Document> danhSachTaiLieu;
 private LibraryView view;
 private Scanner scanner;

 public LibraryController(LibraryView view) {
     this.view = view;
     danhSachTaiLieu = new ArrayList<>();
     scanner = new Scanner(System.in);
 }

 public void themTaiLieu(Document taiLieu) {
     danhSachTaiLieu.add(taiLieu);
     view.hienThiThongBao("Thêm tài liệu thành công.");
 }

 public void xoaTaiLieu(String maTaiLieu) {
     boolean removed = danhSachTaiLieu.removeIf(taiLieu -> taiLieu.getMaTaiLieu().equals(maTaiLieu));
     if (removed) {
         view.hienThiThongBao("Xoá tài liệu thành công.");
     } else {
         view.hienThiThongBao("Không tìm thấy tài liệu có mã " + maTaiLieu + ".");
     }
 }

 public void hienThiThongTinTaiLieu() {
     danhSachTaiLieu.forEach(Document::hienThiThongTin);
 }

 public void timKiemTheoLoai(Class<?> loaiTaiLieu) {
     danhSachTaiLieu.stream()
             .filter(loaiTaiLieu::isInstance)
             .forEach(Document::hienThiThongTin);
 }

 public void khoiDong() {
     view.hienThiThongBao("Chào mừng đến với Hệ thống quản lý thư viện.");
     while (true) {
         view.hienThiMenu();
         String luaChon = view.nhapLuaChon();
         switch (luaChon) {
             case "1":
                 themTaiLieu();
                 break;
             case "2":
                 xoaTaiLieu();
                 break;
             case "3":
                 hienThiThongTinTaiLieu();
                 break;
             case "4":
                 timKiemTheoLoai();
                 break;
             case "5":
                 view.hienThiThongBao("Cảm ơn bạn đã sử dụng Hệ thống quản lý thư viện. Tạm biệt!");
                 return;
             default:
                 view.hienThiThongBao("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
         }
     }
 }

 private void themTaiLieu() {
     view.hienThiThongBao("Chọn loại tài liệu (1. Sách, 2. Tạp chí, 3. Báo):");
     String loaiTaiLieu = scanner.nextLine();
     switch (loaiTaiLieu) {
         case "1":
             themSach();
             break;
         case "2":
             themTapChi();
             break;
         case "3":
             themBao();
             break;
         default:
             view.hienThiThongBao("Lựa chọn không hợp lệ.");
     }
 }

 private void themSach() {
     view.hienThiThongBao("Nhập mã tài liệu:");
     String maTaiLieu = scanner.nextLine();
     view.hienThiThongBao("Nhập tên nhà xuất bản:");
     String tenNhaXuatBan = scanner.nextLine();
     view.hienThiThongBao("Nhập số bản phát hành:");
     int soBanPhatHanh = Integer.parseInt(scanner.nextLine());
     view.hienThiThongBao("Nhập tên tác giả:");
     String tenTacGia = scanner.nextLine();
     view.hienThiThongBao("Nhập số trang:");
     int soTrang = Integer.parseInt(scanner.nextLine());
     Sach sach = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
     themTaiLieu(sach);
 }

 private void themTapChi() {
     view.hienThiThongBao("Nhập mã tài liệu:");
     String maTaiLieu = scanner.nextLine();
     view.hienThiThongBao("Nhập tên nhà xuất bản:");
     String tenNhaXuatBan = scanner.nextLine();
     view.hienThiThongBao("Nhập số bản phát hành:");
     int soBanPhatHanh = Integer.parseInt(scanner.nextLine());
     view.hienThiThongBao("Nhập số phát hành:");
     int soPhatHanh = Integer.parseInt(scanner.nextLine());
     view.hienThiThongBao("Nhập tháng phát hành:");
     int thangPhatHanh = Integer.parseInt(scanner.nextLine());
     TapChi tapChi = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
     themTaiLieu(tapChi);
 }

 private void themBao() {
     view.hienThiThongBao("Nhập mã tài liệu:");
     String maTaiLieu = scanner.nextLine();
     view.hienThiThongBao("Nhập tên nhà xuất bản:");
     String tenNhaXuatBan = scanner.nextLine();
     view.hienThiThongBao("Nhập số bản phát hành:");
     int soBanPhatHanh = Integer.parseInt(scanner.nextLine());
     view.hienThiThongBao("Nhập ngày phát hành:");
     int ngayPhatHanh = Integer.parseInt(scanner.nextLine());
     Bao bao = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
     themTaiLieu(bao);
 }

 private void xoaTaiLieu() {
     view.hienThiThongBao("Nhập mã tài liệu cần xoá:");
     String maTaiLieu = scanner.nextLine();
     xoaTaiLieu(maTaiLieu);
 }

 private void timKiemTheoLoai() {
     view.hienThiThongBao("Chọn loại tài liệu cần tìm kiếm (1. Sách, 2. Tạp chí, 3. Báo):");
     String loaiTaiLieu = scanner.nextLine();
     switch (loaiTaiLieu) {
         case "1":
             timKiemTheoLoai(Sach.class);
             break;
         case "2":
             timKiemTheoLoai(TapChi.class);
             break;
         case "3":
             timKiemTheoLoai(Bao.class);
             break;
         default:
             view.hienThiThongBao("Lựa chọn không hợp lệ.");
     }
 }
}
