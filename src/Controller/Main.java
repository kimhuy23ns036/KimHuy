package Controller;

import View.LibraryView;

public class Main {
 public static void main(String[] args) {
     LibraryView view = new LibraryView();
     LibraryController controller = new LibraryController(view);
     controller.khoiDong();
 }
}

