package pattern;
public class pattern26 {
    public static void main(String[] args) {
        pattern_y(5);
    }

     static void pattern_y(int num){
        //upto 6
        for (int row = 0; row < num+1; row++) {
            for(int col = 0;col < (num+1)-row; col++){
                    System.out.print(row+1+" ");
                }
                System.out.println();
            }
            
        }       
    
}

