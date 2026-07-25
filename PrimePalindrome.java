import java.util.*;

class PrimePalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;

        int rev = d3 * 100 + d2 + d1 * 1;

        int s = 0;
        for (int i = 1; i <= num; i++) {
            s = s + i;

        }
        if (num == rev && rev % s == 0) {
            System.out.println("PrimePalindrome");

        } else {
            System.out.println("Not");
        }

    }
}