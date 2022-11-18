package pattern;
public class pattern7 {
    public static void main(String[] args) {
        pattern_h(5);
    }

    static void pattern_h(int num){
        for (int row = 0; row < num; row++) {
            
            for (int col = 0; col < row; col++) {
                System.out.print("  ");   
            }

            for(int col=0; col<num-row; col++ ){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
