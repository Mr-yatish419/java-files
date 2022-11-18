package pattern;
public class pattern5 {
    public static void main(String[] args) {
       pattern_b(5);
    }
    
    static void pattern_b(int num){
        for(int row = 1; row <= 2 * num-1; row++) {
            
            int totalcolinrow=row > num ? 2 * num-row: row;//N-(row-N)
            for(int col = 1; col <= totalcolinrow; col++){   
            
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
