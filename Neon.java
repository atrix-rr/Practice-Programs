import java.util.*;

class Neon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        double Square = Math.pow(num, 2);
        double F = Square / 10;
        double S = Square % 10;

        double Sum = F + S;
        if (Sum == num) {
            System.out.println("Neon Number");

        } else {
            System.out.println("Not a Neon Number");
        }

    }
}