public class pattern30 {
    public static void main(String[] args) {
        pattern_e(5);
    }
    
    static void pattern_e(int num){
        for (int row = 1; row <= num  ; row++) {

            
            for(int s=1; s <= num-row; s++){
                System.out.print(" ");
            }
                //int totalcolinrow= num>row ? row+(row-1):row;
                for(int col=row; col>1; col--){ 
                    System.out.print(col);
                }

                for (int col = 1; col<=row ; col++) {
                    System.out.print(col);
                }
                
                System.out.println();
        }
    }
}
