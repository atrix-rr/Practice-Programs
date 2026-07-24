import java.util.*;

class Series {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        System.out.println();
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + (i * i);

        }
        System.out.println("Sum is:" + s);
    }
}