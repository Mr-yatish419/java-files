public class pattern {
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int num){
        for (int row = 1; row <= num ; row++) {
            for(int col = 1; col <= num ; col++)
            {
                System.out.print(" * ");
            }

            System.out.println();

        }
    }

}
