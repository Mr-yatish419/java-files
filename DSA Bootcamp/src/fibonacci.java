import java.util.Scanner;
public class fibonacci {

       public static void main(String[] args) { //0,1,1,2,3,5,8
        // int a=0,b=1,c=1;    
        // for (int i = 1; i <= 10; i++) {
        //       c=b;
        //       b=a+b;
        //       a=c;
        //       //total=b+c;
        //       System.out.print(" "+b);
        //         //sum++;
        
        // }
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int n=in.nextInt();
        int p=0;
        int i=1;
        int count=2;

        while(count<=n)
        {
                int temp=i;
                i=i+p;
                p=temp;
                count++;
                
        }
        System.out.println(i);
        
        }        
}


