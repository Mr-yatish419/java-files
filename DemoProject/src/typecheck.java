import java.util.Scanner;
public class typecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter letters");
        char input=in.next().trim().charAt(0);
//        char temp=in.next().trim().charAt(0);
        if(input>='A' && input <='Z'){
            System.out.println("uppercase:"+input);
        }
        else
        {
            System.out.println("lowercase:"+input);
        }


    }
    
}
