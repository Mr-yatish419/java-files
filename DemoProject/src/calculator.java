import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;

public class calculator{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int ans=0;
        
        while(true){
            System.out.println();
            System.out.println("enter the operation to perform");
            char c=in.next().trim().charAt(0);

            System.out.println();
            if(c == '+' || c =='-' || c == '/' || c == '*' || c == '%'){
                   
                    System.out.println("enter two numbers");
                    int num1=in.nextInt();
                    int num2=in.nextInt();
                   

                if(c == '+')
                {
                    System.out.println("Addition");
                    ans=num1+num2;
                } 
                if(c == '-')
                {
                    System.out.println("subtraction");
                    ans=num1-num2;
                }
                if(c == '/')
                {
                    if(num2 != 0)
                    {
                        System.out.println("division");
                        ans=num1/num2;
                    }
                    
                    
                }
                if(c == '*')
                {
                    System.out.println("multipli");
                    ans=num1*num2;
                }
                if(c == '%')
                {
                    System.out.println("modulo");
                    ans=num1%num2;
                }

                 

            }else if(c == 'x' || c =='X')
            {
                System.out.println("operation finished");
                break;
            }
            else{
                System.out.println("Invalid operation");
                ans=0;
            }

        System.out.println(ans);

        }
       

    }
}