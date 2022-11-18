package pattern;
public class pattern33 {
    public static void main(String[] args) {
        pattern_2(5);
    }

    static void pattern_2(int num){
        int alpha=65;//E=69
        for (int row = 1; row <= num; row++) {
            for(int col= num-row; col < num; col++){//reverse 0 01 012
                System.out.print((char)(alpha+col)+" ");
            }
            System.out.println();
        }
    }

}
