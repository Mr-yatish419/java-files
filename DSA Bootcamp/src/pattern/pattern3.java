package pattern;
public class pattern3 {
    public static void main(String[] args) {
        pattern_p(5);
    }
    
    static void pattern_p(int num){
        for (int row = 1; row <= num; row++) {
            for(int col= 1; col <= num-row+1; col++){//5-1+1
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
