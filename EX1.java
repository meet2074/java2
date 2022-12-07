import java.util.Scanner;
import java.util.Random;

public class EX1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n=rand.nextInt(5);
         n+=1;

         System.out.println(n);
         sc.close();
    }
}