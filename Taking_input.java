import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of two numbers is");
        System.out.println(sum);

        // boolean b1=sc.hasNextInt();
        // System.out.println(b1);
        
        // String str=sc.next();
        // System.out.println(str);
        // String str2=sc.nextLine();
        // System.out.println(str2);

        sc.close();
        
    
    }
}
    