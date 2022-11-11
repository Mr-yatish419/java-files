public class pattern8 {
    public static void main(String[] args) {
        pattern_i(5);
    }

    static void pattern_i(int num){
        for (int row= 1; row <= num; row++) {   

            for(int col=1;col<=num-row;col++){
                System.out.print("  ");
            }

            for(int col=row;col > 1;col--){
                System.out.print(" *");
            }

            for (int col=1 ; col <= row; col++) {
                System.out.print(" *");
            }
                System.out.println();
        }
    }
    
}
