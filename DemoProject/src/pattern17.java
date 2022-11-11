public class pattern17 {
    public static void main(String[] args) {
        pattern_f(4);
    }

    static void pattern_f(int num){
        for (int row = 1; row <= 2 * num-1; row++) {
            
            int totalcolinrow=row > num ? 2 *num-row:row;//8-5=3
            for(int s=1; s <= num-totalcolinrow; s++){//5-1
                System.out.print(" ");
            }


            for(int col=totalcolinrow; col > 1; col--){ 
                System.out.print(col);
            }

            for (int col = 1; col<=totalcolinrow; col++) {
                System.out.print(col);
            }

            System.out.println();
        

         
         }
    }
}
