import java.util.*;

class MonthDaysMenu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Months Name");
        System.out.println("2) Days Menu");
        System.out.println("Enter your Choice");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("January");
                System.out.println("February");
                System.out.println("March");
                System.out.println("April");
                System.out.println("May");
                System.out.println("June");
                System.out.println("July");
                System.out.println("August");
                System.out.println("September");
                System.out.println("October");
                System.out.println("November");
                System.out.println("December");
                break;

            case 2:
                System.out.println("Monday");
                System.out.println("Tuesday");
                System.out.println("Wednesday");
                System.out.println("Thursday");
                System.out.println("Friday");
                System.out.println("Saturday");
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Statement");
                break;
        }

    }
}