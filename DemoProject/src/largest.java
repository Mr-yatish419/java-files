import java.util.Scanner;
public class largest {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter numbers to find largest of them");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        
        // if(num1>num2)
        // {
        //     System.out.println("largest:"+num1);
        // }
        // else if(num2>num3){
        //     System.out.println("largest:"+num2);
        // }
        // else{
        //     System.out.println("largest:"+num3);
        // }

        // int max=num1;
        // if(num2>max){
        //     max=num2;
        // }
        // if(num3>max){
        //     max=num3; 
        // }
        // System.out.println("largest:"+max);


        int max=Math.max(num3,Math.max(num1,num2));//(num1 and num2 gives max and than compared with num3)
        System.out.println("largest:"+max);
    }
}
