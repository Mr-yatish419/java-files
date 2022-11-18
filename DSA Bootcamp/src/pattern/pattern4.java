package pattern;
public class pattern4 {
    public static void main(String[] args) {
           pattern_a(5);
    }

    static void pattern_a(int num){
        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        
    }
    
}
