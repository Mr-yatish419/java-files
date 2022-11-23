package pattern;

public class pattern35 {
    public static void main(String[] args) 
    {

        for (int row = 1; row <= 7 ; row++) {
            for (int col = row; col <= 7; col++) {
                System.out.print(col);    
            }
            for(int col=1;col <=row-1;col++ ){
                System.out.print(col);
            }
            System.out.println();   
        }
    }
}
