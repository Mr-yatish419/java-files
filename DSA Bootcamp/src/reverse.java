public class reverse {
    public static void main(String[] args) {
        // int n=23597;
        // int rem=0;
        // int rev=0;
        // while(n!=0)
        // {
        //     rem=n%10;
        //     rev=rem;
        //     n=n/10;
        //     System.out.print(rev);
        // }

        int n=23597;
        int rem=0;
        int rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
            
        }
        System.out.print(rev);
        
    }
}
