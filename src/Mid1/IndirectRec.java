package Mid1;

public class IndirectRec {
    // Java program to print from 1 to N using
// indirect recursion
    // We can avoid use of these using references
    static final int N = 20;
    static int n = 1;

    // Prints n, increments n and calls fun1()
    static void fun1() {
        if (n <= N) {
            System.out.printf("%d ", n);
            n++;
            fun2();
        } else {
            return;
        }
    }

    // Prints n, increments n and calls fun2()
    static void fun2() {
        if (n <= N) {
            System.out.printf("%d ", n);
            n++;
            fun1();
        } else {
            return;
        }
    }

    // Driver Program
    public static void main(String[] args) {
        fun1();
    }
}
