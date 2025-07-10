package oop.OnTapJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        // Lặp trong khi con trỏ trái chưa vượt qua con trỏ phải
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                // Tìm thấy, trả về chỉ số (cộng 1 theo yêu cầu đề bài)
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                // Tổng quá nhỏ, di chuyển con trỏ trái sang phải để tăng tổng
                left++;
            } else { // currentSum > target
                // Tổng quá lớn, di chuyển con trỏ phải sang trái để giảm tổng
                right--;
            }
        }

        // Theo đề bài luôn có một giải pháp, nhưng ta có thể trả về mảng rỗng hoặc null nếu không tìm thấy
        return new int[0];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
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
            System.out.print("Nhập giá trị tổng mong muốn: ");
            int targetNumber = scanner.nextInt();
            int[] ketQua = twoSum(arr, targetNumber);
            System.out.println("Vị trí 2 phầng tử tổng bằng giá trị mong muốn là: " + Arrays.toString(ketQua));
        }
    }
}
