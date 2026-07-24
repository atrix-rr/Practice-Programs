import java.util.*;

class Even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }

    }
}