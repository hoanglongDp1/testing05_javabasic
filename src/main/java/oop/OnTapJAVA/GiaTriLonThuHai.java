package oop.OnTapJAVA;

import java.util.Scanner;

public class GiaTriLonThuHai {
    public static int secondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > maxValue) {
                secondMaxValue = maxValue;
                maxValue = i;
            } else if (i > secondMaxValue && i < maxValue) {
                secondMaxValue = i;
            }
        }
        return secondMaxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int elementNumbers = scanner.nextInt();
        if (elementNumbers <= 0) {
            System.out.println("Số lượng phần tử của mảng đã nhập không hợp lệ");
        }
        else {
            int[] arr = new int[elementNumbers];
            for (int i = 0; i < elementNumbers; i++) {
                System.out.print("Phần tử thú " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
            System.out.println("Giá trị lớn thứ 2 trong mảng là: " + secondMax(arr));
        }
    }
}