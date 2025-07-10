package oop.OnTapJAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KiemTraChuoiDoiXung {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        int leftSide = 0;
        int rightSide = str.length() - 1;
        while (leftSide < rightSide) {
            if (str.charAt(leftSide) != str.charAt(rightSide)) {
                return false;
            }

            leftSide++;
            rightSide--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra đối xứng: ");
        String chuoiCanKiemTra = scanner.nextLine();
        System.out.println("Input: " + chuoiCanKiemTra + " -> Output: " + isPalindrome(chuoiCanKiemTra));
        scanner.close();
    }
}
