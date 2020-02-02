package Mid1;

import java.util.Scanner;

public class FacRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factFun(number));
    }

    public static long factFun(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factFun(number - 1);
        }
    }

}
