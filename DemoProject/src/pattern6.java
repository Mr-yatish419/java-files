public class pattern6 {
    public static void main(String[] args) {
        pattern_c(5);
    }

    static void pattern_c(int num){
        for (int row = 1; row <= num ; row++) {
             for(int col= 1; col <= num-row+1; col++ ){
                System.out.print(" ");
             }       

             for (int col = 1; col <= row; col++) {
                System.out.print("*");
             }
             System.out.println();
        }
       
    }
}
