package pattern;
public class pattern25 {
    public static void main(String[] args) {
        pattern_x(5);
    }

    static void pattern_x(int num){
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num-row; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < num; col++) {
                if(col==0||col==(num-1)||row==0||row==(num-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }
}
