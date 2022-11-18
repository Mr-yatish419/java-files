package pattern;
public class pattern24 {
    public static void main(String[] args) {
        pattern_w(5);
    }

    static void pattern_w(int num){
        for (int row = 1; row <= 2 * num; row++) {
            
            int totalcolinrow = row > num? 2*num-row:row;
            for(int col= 1; col <= totalcolinrow; col++){
                if(col==1 || col==totalcolinrow){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }             
            }

            for (int col = 1; col <= num-totalcolinrow; col++) {
                System.out.print("  ");
            }
            
            for(int col= totalcolinrow; col >= 1 ; col--){
                if(col==1 || col==totalcolinrow){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }       
            }
            System.out.println();
        }
    }
}
