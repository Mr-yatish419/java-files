package pattern;
public class pattern9 {
    public static void main(String[] args) {
        pattern_j(5);
    }

    static void pattern_j(int num){
        int totalcolinrow=2*num-1;
        for (int row= 0; row <  num; row++) {   

            for(int col=1;col<=row;col++){
                System.out.print("  ");
            }

                            
               for (int col=1 ; col <= totalcolinrow;col++){
                    
                        System.out.print(" *");
                    
                }
                totalcolinrow=row < num?totalcolinrow=totalcolinrow-2:0;
                System.out.println();
        }
    }
}
