package pattern;
public class pattern10 {
    public static void main(String[] args) {
        pattern_j(5);
    }

    static void pattern_j(int num){
        for (int row= 1; row <= num; row++) {   

            for(int col=1;col<=num-row;col++){
                System.out.print(" ");
            }

            for (int col=1 ; col <= row; col++) {
                System.out.print(" *");
            }
                System.out.println();
        }

    }
}
