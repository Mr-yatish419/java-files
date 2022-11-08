import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      
        int num=407;
        int rem=0;
        int temp=1000;
        int temp2=1;
        int arm=0;
        int cnt=0;


      //armstrong number for three digits
        
        int temp_n=0;
        
        while(temp_n!=num)
        {
            temp=temp/10;
            temp_n=num;
            temp_n=temp_n/temp;
            
            rem=temp_n%10;
            
            //arm=rem*rem*rem+arm;  

           // System.out.println(arm);

              int store=1;
              while(store<=rem) //math.pow (will do this function)
              {
                temp2=rem*rem;
                arm=temp2+arm;
                store++;
              }
              

            
            cnt=0; 
               
        }
        
       System.out.println(arm);  

        if(arm==num)
        {
             System.out.println("armstrong number:"+arm);
        }else
        {
          System.out.println("not armstrong");
        }
    }
  }