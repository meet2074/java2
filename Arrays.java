public class Arrays {
    public static void main(String[] args) {
        //This programme is about of the array

        //Below are Some methods of writing an array
        int [] marks;
        marks = new int [10];
        marks[0]=100;
        marks[1]=30;
        marks[2]=40;
        marks[3]=50;
        marks[4]=42;

        //Or

        int [] mark2= new int[4];
        mark2[2] =50;

        //Or

        int [] mark3 = {40,21,45,75,46,45};
            
        System.out.println(marks[4]);
        System.out.println(mark2[2]);
        System.out.println(mark3[2]);
    }
}
