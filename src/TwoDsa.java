import java.util.LinkedList;
import java.util.Scanner;

public class TwoDsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char[] arr = str.toCharArray();
        LinkedList linkedList = new LinkedList();
        while (b > 0) {
            for (int i = a; i < arr.length; i++) {
                if (arr[i] != ' ') {
                    linkedList.addLast(arr[i]);
                    linkedList.addLast(' ');
                }

            }
            for (int i = 0; i < a; i++) {
                if (arr[i] != ' ') {
                    linkedList.addLast(arr[i]);
                    linkedList.addLast(' ');
                }
            }
            b--;
        }
        for (Object i : linkedList
        ) {
            System.out.print(i);

        }
    }
}
