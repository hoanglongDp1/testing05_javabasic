package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //lệnh xuất
        System.out.println("Helo Testing05");
        System.out.println("Hello Mentor");

        //snippet lệnh xuất - gõ sout
        System.out.println("Hello CyberSoft");

        //comment nhanh - ctrl + / hoặc macbook command + /

        //lệnh nhập
        Scanner scanner = new Scanner(System.in);

        //Biến - nơi lưu trữ dự liệu
        //<kiểu dữ liệu><tên biến> = <giá trị khởi tạo>

        //kiểu dữ liệu dạng primative value: byte, short, int, long, float, char, boolean, double,...
        //kiểu dữ liệu dạng tham chiếu: string, array, class, object và interface

        int age = 18;
        double salary = 1500.15;
        String name1 = "Long";
        boolean isLogin = true; //false

        //hằng số - giá trị không đổi
        final double pi = 3.14159;

        //yêu cầu: cho phép người dùng nhập vào tên mình và xuất ra màn hình
        //ô nhập
//        System.out.println("Nhập tên người dùng: ");
        //nhận giá trị từ người dùng nhập và gắn vào biến
//        String name = scanner.nextLine();
        //xuất ra màn hình
//        System.out.println("Xin chào " + name);

        //yêu cầu: viết chương trình cho sinh viên nhâp vào tên, lớp và tuổi(scanner.nextInt()) và in ra màn hình

        //nhập tên sinh viên
        System.out.println("Nhâp tên sinh viên: ");
        String ten = scanner.nextLine();

        //nhập lớp
        System.out.println("Nhập lớp: ");
        String lop = scanner.nextLine();

        //nhập số tuổi
        System.out.println("Nhập số tuổi: ");
        int tuoi = scanner.nextInt();

        System.out.println("Xin chào: " + ten + ", " + "Hiện đang "+ tuoi + " tuổi" + ", " + "Học lớp " + lop + ".");
    }
}