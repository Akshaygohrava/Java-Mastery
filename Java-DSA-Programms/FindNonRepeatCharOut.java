public class FindNonRepeatCharOut {
    public static void main(String[] args) {
        System.out.println("Hello, Java DSA !");
        System.out.println("Find Non Repeating Char Out !");
        
        String text = "aabbccddee";

        for(int i =0; i < text.length();i++) {
            char c = text.charAt(i);
            if (text.indexOf(c) == text.lastIndexOf(c)) {
                System.out.println("Non Repeating Character is : " + c);
                return;
            }
        }
        System.out.println("Non Repeating Character is Not Found !");

    }
}
