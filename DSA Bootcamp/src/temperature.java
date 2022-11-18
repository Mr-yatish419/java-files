import java.util.Scanner;
public class temperature{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Converting celsiuis to Faranhite");
         System.out.println("Enter celsius number");
        float C=sc.nextFloat();
        float F = (C * 9/5) + 32;
        System.out.println(F);

    }
}