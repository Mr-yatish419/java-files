package pattern;
public class pattern8 {
    public static void main(String[] args) {
        pattern_i(5);
    }

    static void pattern_i(int num){
        int totalcolinrow=1;
        for (int row= 0; row <  num; row++) {   

            for(int col=1;col<=num-row;col++){
                System.out.print("  ");
            }

                            
               for (int col=1 ; col <= totalcolinrow;col++){
                    
                        System.out.print(" *");
                    
                }
                totalcolinrow=row < num?totalcolinrow=totalcolinrow+2:0;//odd numbers
                System.out.println();

        }
    }
    
}
