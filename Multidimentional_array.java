

public class Multidimentional_array {
    public static void main(String[] args) {
        //A 1-D array
        int[][] flats;//A 2-D array
        flats = new int[2][3];
        flats[0][0]=101; 
        flats[0][1]=102; 
        flats[0][2]=103; 
        flats[1][0]=201; 
        flats[1][1]=202; 
        flats[1][2]=203; 

        System.out.println("Printing an array using a loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
