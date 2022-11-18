package pattern;
public class pattern12 {
    public static void main(String[] args) {
        pattern_l(5);    
    }

    static void pattern_l(int num){
        for (int row = 0; row < 2* num; row++) {
            int totalcolinrow=row >= num?(2*num-1)-row:row;
          
            for(int col=0; col < totalcolinrow;col++){
                System.out.print(" ");
            }

           
            for(int col=0; col < num-totalcolinrow; col++){

                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
