import java.util.Scanner;
public class typecasting {
    public static void main(String[] args)
    {
            // System.out.println("Enter the marks");
            // Scanner sc=new Scanner(System.in);
            // float marks=sc.nextFloat();

            // System.out.println(marks);//auto typecasting

            // System.out.println("typecasting float to integer");
            // int numbers=(int)marks;//(big)
            // System.out.println(numbers);

            // System.out.println("type promotion in expression");
             
            // byte num1=40;
            // byte num2=50;
            // int c=(num1*num2)/100;//byte to int

            // System.out.println(c);
            

            System.out.println("type promotion in expression");
            byte b=42;
            char c='a';
            short s=1024;
            int i =50000;
            float f=5.67f;
            double d=0.1234;

            double result=(f*b)+(i/c)-(d*s);
            //float + int -double =double
            System.out.println(result);

    }
}
