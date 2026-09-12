public class ArraysPractices {
    public static void main(String[] args) {
        
        String[] fruits = {"Mango", "Banana", "Apples", "PineApple"};

        
        int[][] score = {{34, 54, 22 },{42, 67, 53}};


        int[] marks = {45, 36, 55, 42, 67, 33, 51};

        int highestarr = marks[0];

        for(int i = 0; i < marks.length; i++) {
            System.out.println(highestarr);
            if (marks[i] > highestarr) {
                highestarr = marks[i];
            }

        }

        System.out.println("Highest Array : " + highestarr);








    }
}
