package oop.OnTapJAVA;

import java.util.Scanner;

public class TinhTongCacSoChan {
    public static int sumOfEvenNumbers (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương: ");
        int positiveIntegerNumber = scanner.nextInt();
        if (positiveIntegerNumber < 0) {
            System.out.println("Số vừa nhập vào không phải số nguyên dương");
        }
        else {
            System.out.println("Tổng các số chẵn tính đến " + positiveIntegerNumber + " = " + sumOfEvenNumbers(positiveIntegerNumber));
        }
    }
}
