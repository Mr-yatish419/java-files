package pattern;
public class pattern27 {
    public static void main(String[] args) {
        pattern_z(5);
    }

    static void pattern_z(int num){
        int sum=0,sub=20;
        for (int row = 1; row <= num; row++) {

            for(int col= 1; col < row; col++) {
                System.out.print(" ");
            }

            for(int col = 1; col<= num-row; col++){
                    sum=sum+1;
                    System.out.print(" "+sum);

            }
    
            int totalcolinrow=1<=num-row?20:row;
            for(int col = sub-(num-row); col <= totalcolinrow ;col++){
                 sub=col;
                System.out.print(" "+sub);
            }
            System.out.println();
        }
        System.out.print(" "+sum);
    }
}
