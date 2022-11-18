package pattern;
public class pattern22 {
   public static void main(String[] args) {
    pattern_u(5);
   }
    
   static void pattern_u(int num){
 
    for (int row = 1; row <= num ; row++) {
    
          //checking if even
         if(row%2==0){
            int sum=0;

            
            for (int col = 1; col <= row; col++) {
               System.out.print(sum+" ");
               sum=(sum==0)?1:0;
 
            }
         }
            
         //checking if odd
         if(row%2==1){
             int sum = 1;

             for (int col = 1; col <= row; col++) {
                  System.out.print(sum+" ");
                  sum=(sum==1)?0:1;
             }

         }
            
       System.out.println();
       
     }
   }
}


