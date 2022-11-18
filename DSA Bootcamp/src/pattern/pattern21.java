package pattern;
public class pattern21 {
    public static void main(String[] args) {
        pattern_T(5);
    }

    static void pattern_T(int num){
         int sum=0;
         for (int row = 0; row < num ; row++) {
            for(int col = 0; col <= row; col++){
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
            
         }
    }
}
