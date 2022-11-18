package pattern;
public class pattern16 {
    public static void main(String[] args) {
        pattern_p(5);
    }

    static void pattern_p(int num){
        int sum=1;
        
       
        for (int row = 1; row <= num; row++) {

            for(int col=1;col<=num-row;col++){
                System.out.print(" ");
            }
            
            if(row==1){
                System.out.println(row);
                continue;
            }else{
                sum=sum*11;
                System.out.print(sum);
            }
            System.out.println();
      
        }
        
    }

 
} 
