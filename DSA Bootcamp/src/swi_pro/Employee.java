package swi_pro;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter options");
        int input=in.nextInt();
        String department=in.next();

        switch(input){
            case 1:System.out.print("Raj Rahul");
                  break;
            case 2:System.out.print("lala bhai");
                  break;
            case 3:System.out.println("Vasuli Bhai");
                    switch(department){
                        case "IT":System.out.println("IT Department");
                                break;
                        case "Management":System.out.println("Management Department");
                                break;
                        default :System.out.println("invalid!");
                    }
                    break;
            default:System.out.print("Enter valid option");
        }

    }
}
