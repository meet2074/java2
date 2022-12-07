import java.util.Scanner;

public class for_loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print:");
        int a = sc.nextInt();

        int i;
        int j;

        for (i = a; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
