package pattern;
public class pattern23 {
    public static void main(String[] args) {
        pattern_v(5);
    }

    static void pattern_v(int num){
        for (int row = 1; row <= num; row++) {
          
         if(row%2==0){
            System.out.print(" ");
         }else{

            for(int col=1; col<= num-row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*num; col++){
                if(col==1 || col==row || col==5 ||col==num+(row-1)){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }

         }
           
            System.out.println();
        }

    }
}
