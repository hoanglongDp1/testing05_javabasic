package oop.OnTapJAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ThueThuNhapCaNhan {
    public static double calculatePersonalTax(double thuNhap) {
        double thuePhaiTra = 0;
        final double mucThue01 = 5000000;
        final double mucThue02 = 10000000;
        final double mucThue03 = 18000000;
        final double mucThue04 = 32000000;
        final double mucThue05 = 52000000;
        final double mucThue06 = 80000000;

        final double thueTaiMucThue01 = mucThue01 * 0.05;
        final double thueTaiMucThue02 = thueTaiMucThue01 + (mucThue02 - mucThue01) * 0.10;
        final double thueTaiMucThue03 = thueTaiMucThue02 + (mucThue03 - mucThue02) * 0.15;
        final double thueTaiMucThue04 = thueTaiMucThue03 + (mucThue04 - mucThue03) * 0.20;
        final double thueTaiMucThue05 = thueTaiMucThue04 + (mucThue05 - mucThue04) * 0.25;
        final double thueTaiMucThue06 = thueTaiMucThue05 + (mucThue06 - mucThue05) * 0.30;

        if (thuNhap > mucThue06) {
            thuePhaiTra = (thuNhap - mucThue06) * 0.35 + thueTaiMucThue06;
        } else if (thuNhap >= mucThue05) {
            thuePhaiTra = (thuNhap - mucThue05) * 0.30 + thueTaiMucThue05;
        } else if (thuNhap >= mucThue04) {
            thuePhaiTra = (thuNhap - mucThue04) * 0.25 + thueTaiMucThue04;
        } else if (thuNhap >= mucThue03) {
            thuePhaiTra = (thuNhap - mucThue03) * 0.20 + thueTaiMucThue03;
        } else if (thuNhap >= mucThue02) {
            thuePhaiTra = (thuNhap - mucThue02) * 0.15 + thueTaiMucThue02;
        } else if (thuNhap >= mucThue01) {
            thuePhaiTra = (thuNhap - mucThue01) * 0.10 + thueTaiMucThue01;
        } else if (thuNhap > 0) {
            thuePhaiTra = thuNhap * 0.05;
        }

        return thuePhaiTra;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập tổng thu nhập: ");
        double thuNhap = scanner.nextDouble();

        if (thuNhap < 0) {
            System.out.println("Thu nhập không thể là số âm");
        } else {
            DecimalFormat formatter = new DecimalFormat("###,###,###.##");
            double soThuePhaiTra = calculatePersonalTax(thuNhap);
            System.out.println("Số thuế bạn phải trả là: " + formatter.format(soThuePhaiTra));
        }
        scanner.close();
    }
}
