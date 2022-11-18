package pattern;
public class pattern13 {
    public static void main(String[] args) {
        pattern_m(5);
    }

    static void pattern_m(int num){
        int totalcolinrow=1;
        for (int row= 0; row <  num; row++) {   

            for(int col=1;col<=num-row;col++){
                System.out.print("  ");
            }

                            
               for (int col=1 ; col <= totalcolinrow;col++){
                    if(col==totalcolinrow || col==1||totalcolinrow==(2*num-1)){
                        System.out.print(" *");
                    }else{
                        System.out.print(" ");
                        System.out.print(" ");
                    }
                        
                    
                }
                totalcolinrow=row < num?totalcolinrow=totalcolinrow+2:0;
                System.out.println();

        }
    }
}
