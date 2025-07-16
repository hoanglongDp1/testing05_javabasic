package oop.OnTapJAVA;

import java.util.Scanner;

public class InChuCaiDauMoiTu {
    public static String firstCharacterEachWord(String input) {
        if (input == null || input.isEmpty()) {
            return "Chuỗi rỗng";
        }
        String[] words = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.charAt(0)).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Chuuỗi chữ cái đầu mỗi từ " + firstCharacterEachWord(str));
    }
}
