public class StarPattern {
    public static void main(String[] args) {

        System.out.println("Star Patterns :");

        int n = 3;  // number of pattern, in row 

        for(int i = 1; i <= n;i++) {
            for(int j = 1;j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}