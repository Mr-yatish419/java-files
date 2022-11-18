import java.util.Scanner;
public class Bonus {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary Amount");
        float salary=sc.nextInt();
        // if(salary>5000)
        // {
        //     salary+=2000;
        // }
        // else{
        //     salary+=1000;
        // }

        if(salary>10000)
        {
            salary+=2000;
        }
        else if(salary>20000)
        {
            salary+=3000;
        }
        else{
            salary+=1000;
        }

        System.out.println("SALARY WITH BONUS:"+salary);
    }
}
