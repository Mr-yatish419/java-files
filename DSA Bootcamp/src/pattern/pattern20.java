package pattern;
public class pattern20 {
    public static void main(String[] args) {
        pattern_s(5);
    }

    static void pattern_s(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num-1 ; col++) {
             
                if(col==1||col==num-1||row==1||row==num){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
            
        }

    }
}
