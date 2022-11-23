package pattern;

public class pattern37 {
    public static void main(String[] args) {
     fun(4);
    }

    static void fun(int num){
       // int temp=1;
        for (int row = 1; row <= num ; row++) {
            //int totalcolinrow=row>=1?num-row:0;
            for (int col = 1; col <=num-row ; col++) {
                System.out.print(" ");
            }
         

            for (int col = 1 ; col <= 2*row-1; col++) {
                if(col==2*row-1||col==1||row==num){
                    System.out.print(row);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}
