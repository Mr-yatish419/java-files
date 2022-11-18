package pattern;
public class pattern32 {
    public static void main(String[] args) {
        pattern_1(5);
    }

    static void pattern_1(int num){
        char alpha=65;
        for (int row = 0; row <= num; row++) {

                for(int col=0;col<=row;col++){
                        System.out.print((char)(alpha+col)+" ");//will run till col
                    
                }
                      
            System.out.println();
        }
    }
}
