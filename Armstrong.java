import java.util.Scanner;

class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int org = n; // Original number copy for final check
        int s = 0; // Sum variable
        int a; // Digit variable

        // Armstrong Logic
        while (n > 0) {
            a = n % 10; // Last digit extract karo
            s = s + (a * a * a); // Digit ka cube sum mein add karo
            n = n / 10; // Last digit remove karo
        }

        // Output Check
        if (s == org) {
            System.out.println(org + " is an Armstrong Number.");
        } else {
            System.out.println(org + " is NOT an Armstrong Number.");
        }
    }
}