package oop.OnTapJAVA;

import java.util.Scanner;

public class XoaNguyenAm{
    public static String deleteNguyenAm(String input){
        if (input == null || input.isEmpty()){
            return input;
        }

        StringBuilder ketQuaBuilder = new StringBuilder();

        String nguyenAm = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++){
            char kyTuHienTai = input.charAt(i);

            if (nguyenAm.indexOf(kyTuHienTai) == -1){
                ketQuaBuilder.append(kyTuHienTai);
            }
        }
        return ketQuaBuilder.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        String result = deleteNguyenAm(chuoi);
        System.out.println("Kết quả sau khi loại bỏ nguyên âm: " + result);
    }
}
