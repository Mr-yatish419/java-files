package swi_pro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // System.out.println("Enter fruit name");
        // String fruit=in.next();

        // switch(fruit){//case should be same data type as fruit
        //     case "mango":System.out.print("king of fruit");
        //                 break;
        //     case "apple":System.out.print("sweet red apple");
        //                 break;
        //     case "orange":System.out.print("round fruit");
        //                 break;
        //     case "grapes":System.out.print("small fruits");
        //                 break;
        //     default:System.out.print("invalid!");
              
        // }
        System.out.println("Enter week days");
        int day=in.nextInt();

        switch(day){//case should be same data type as fruit
            case 1:System.out.print("Monday");
                   break;
            case 2:System.out.print("Tuesday");
                   break;
            case 3:System.out.print("wednesday");
                   break;
            case 4:System.out.print("Thursday");
                   break;
            case 5:System.out.print("Friday");
                   break;
            case 6:System.out.print("Saturday");
                   break;
            case 7:System.out.println("Sunday");
                   break;
            default:System.out.print("invalid");
        }
    }
}
