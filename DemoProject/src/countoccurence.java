public class countoccurence {
 
    public static void main(String[] args) {
        int n=138575;
        int rem=0;
        int count=0;
        while(n != 0)
        {
            rem=n%10;
            if(rem==5)
            {
                count=count+1;

            }
            n=n/10;
        }
        System.out.println("count:"+count);
        
    }


}
