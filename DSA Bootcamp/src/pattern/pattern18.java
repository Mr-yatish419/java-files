package pattern;


public class pattern18 {
    public static void main(String[] args) {
        pattern_q(5);
    }

    static void pattern_q(int num){
        for (int row = 1; row <= 2 * num; row++) {
            
            int totalcolinrow = row >= num? 2*num-row:row;
            for (int col = 1; col <= num-totalcolinrow; col++) {
                System.out.print("*");
            }


            for (int col = totalcolinrow; col >= 1; col--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalcolinrow; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= num-totalcolinrow; col++) {
                System.out.print("*");
            }
            System.out.println();

        
        }
    }
}
