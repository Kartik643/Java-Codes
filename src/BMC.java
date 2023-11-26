import java.util.Scanner;

public class BMC {
    public static void main(String[] args) {
        findSmallestAbove100();
    }
    public static void findSmallestAbove100() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[50];

        int index = 0;
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            numbers[index] = num;
            index++;
        }
        int smallestAbove100 = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            if (numbers[i] >= 100 && numbers[i] < smallestAbove100) {
                smallestAbove100 = numbers[i];
            }
        }
        if (smallestAbove100 != Integer.MAX_VALUE) {
            System.out.println(smallestAbove100);
        } else {
            System.out.println("-1");
        }
    }
}