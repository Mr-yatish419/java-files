package pattern;
public class pattern34 {
    public static void main(String[] args) {
        pattern_3(5);
    }

    static void pattern_3(int num){
        int alpha=65;
        for (int row = 1; row <= num; row++) {
            for(int col=num-row;col>=0;col--){
                System.out.print((char)(alpha+col)+" ");
            }
            System.out.println();
        }
    }
}
