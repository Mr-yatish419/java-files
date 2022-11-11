//find 2 min from array 
public class pattern28 {
    public static void main(String[] args) {
       pattern_d(5);
    }

    static void pattern_d(int num){
        for (int row = 1; row <= 2*num-1; row++) {
            int totalcolinrow=row > num ? 2*num-row:row;
     
         
            int spaces=num-totalcolinrow;//(5-1,5-2,....,5-5,5-4,.....)
            for (int noofspaces = 1; noofspaces <= spaces ; noofspaces++) {
                System.out.print( " ");
            }

            for (int col = 1; col <= totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
