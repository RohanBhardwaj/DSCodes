package Mid1;

import java.util.Scanner;

public class PowerRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println(PowFun(number, power));
    }

    public static long PowFun(int number, int power) {
        if (power == 0) {
            return 1;
        } else {
            return number * PowFun(number, power - 1);
        }
    }
}
