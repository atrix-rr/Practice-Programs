import java.util.*;

class ArmstrongPrint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 100; i <= 999; i++) {
            int s = 0, n = i;
            while (n >= 1) {
                int a = n % 10;
                s = s + (a * a * a);
                n = n / 10;

            }
            if (s == i) {
                System.out.println(i);
            }
        }
    }
}