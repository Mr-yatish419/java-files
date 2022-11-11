public class pattern31 {
    public static void main(String[] args) {
        pattern_g(4);  
    }

    static void pattern_g(int num){
        int originalN=num;
        int n=2*num;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++){
                int atEveryIndex=originalN-Math.min(Math.min(col,n-col),Math.min(row,n-row));
                //for (int temp = atEveryIndex; temp > atEveryIndex; temp--) {
                    System.out.print(atEveryIndex+" ");
                 
              } 
              System.out.println();
             
            }
            
            
        }
}
 

