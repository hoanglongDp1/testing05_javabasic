package oop.OnTapJAVA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class XoaKyTuLapLai {
    public static String deleteDuplicate (String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Set<Character> daDuyet = new HashSet<>();
        StringBuilder ketQua = new StringBuilder();

        for (char kyTu : str.toCharArray()) {
            if (daDuyet.add(kyTu)) {
                ketQua.append(kyTu);
            }
        }
        return ketQua.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoiCanKiemTra = scanner.nextLine();
        System.out.println("Input: " + chuoiCanKiemTra + " -> Output: " + deleteDuplicate(chuoiCanKiemTra));
        scanner.close();
    }
}
