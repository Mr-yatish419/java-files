package pattern;
public class pattern11 {
    public static void main(String[] args) {
        pattern_k(5);
    }
    
     static void pattern_k(int num) {
        for (int row= 0; row < num; row++) {   

            for(int col= 0;col< row;col++){
                System.out.print(" ");
            }

            for (int col=0 ; col < num-row; col++) {
                System.out.print(" *");
            }
                System.out.println();
        }
    }
}
