package pattern;
public class pattern15 {
    public static void main(String[] args) {
        pattern_o(5);
    }

    static void pattern_o(int num){
        for (int row = 1; row <= 2 * num-1; row++) {
            
            int totalcolinrow=row > num ? 2 *num-row:row;//8-5=3
            for(int s=1; s <= num-totalcolinrow; s++){//5-1
                System.out.print(" ");
            }


            for(int col=totalcolinrow; col > 1; col--){ 
                if(col==totalcolinrow){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            for (int col = 1; col<=totalcolinrow; col++){
                if(col==totalcolinrow){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
