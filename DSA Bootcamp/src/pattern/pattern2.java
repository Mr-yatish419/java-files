package pattern;
public class pattern2 {
    public static void main(String[] args) {
        pattern_p();
    }
    
    static void pattern_p(){
        for (int row = 1; row <= 5; row++) {
            for(int col=1; col <= row; col++ ){
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
