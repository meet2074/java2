
import java.util.Scanner;

public class switch_case {
   public static void main(String[] args) {
    System.out.println("Enter your age");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();

    switch(a){
        case (18):
        System.out.println("You are going to become an adult");
        break;

        case (22):
        System.out.println("Your age is 22");
        break;

        case(60):
        System.out.println("You are going to retire");
        break;

        default:
        System.out.println("you are happy in your life");
    }
    sc.close();
   }
}
