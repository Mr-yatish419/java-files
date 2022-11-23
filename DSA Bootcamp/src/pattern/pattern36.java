package pattern;

public class pattern36 {
    public static void main(String[] args) {
        for(int row=1;row<=4;row++){
            for(int col=1;col<=6;col++){
               if((row+col)%2==1){
                System.out.print(2);
               }else{
                System.out.print(1);
               }
               
            }
            System.out.println();
        }   
    }
}
