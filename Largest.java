import java.util.*;

class Largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is Greatest");

            } else {
                System.out.println("B is Greatest");

            }

        } else {
            if (b > c) {
                System.out.println("B is Greatest");

            } else {
                System.out.println("Cis Greatest");
            }
        }
    }
}