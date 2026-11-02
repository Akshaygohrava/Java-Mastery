public class CoreJava3 {
    public static void main(String[] args) {
        
        System.out.println("Difference between == / .equals() / .hascode() ");
        
        String a = "cat";
        String b = "cat";
        String c = "dog";

        String x = new String("cat");
        String y = new String("dog");

        System.out.println(a == b); // true , Check Memory Reference

        System.out.println(a == c); // false

        System.out.println(a.equals(b)); // true  // Check Content Value

        System.out.println(a.equals(c)); // false

        System.out.println(a.equals(x));  // true
        System.out.println(a == x);   // false , new keywords creates new memory reference

        System.out.println(a.hashCode());  // 98262 -  Return INT values 



    }
}
