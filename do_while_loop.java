import java.util.Scanner;

public class do_while_loop {
    public static void main(String[] args) {
        int sum=0;
        int number=0;
        Scanner inp= new Scanner(System.in);

        do{
            sum+=number;
            System.out.println("Enter a number");
            number=inp.nextInt();

        }while(number>=0);

        System.out.println("sum="+sum);
        inp.close();
    }
    
}
