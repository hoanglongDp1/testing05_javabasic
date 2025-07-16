package oop.OnTapJAVA;

import java.util.Scanner;

public class DemSoTuMotChuoi {
    public static int countWords (String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String trimmedInput = input.trim();
        if (trimmedInput.isEmpty()) {
            return 0;
        }
        String[] words = trimmedInput.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Tổng số từ trong chuỗi: " + countWords(str));
    }
}
