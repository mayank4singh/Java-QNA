//Find Length, Concatenate and Replace String in Java Program
public class str43 {
    public static void main(String[] args) {
        int n;
        String s = "Java programming", 
        t = "", 
        u = ""; 
        System.out.println(s);
        // Find length of string
        n = s.length();
        System.out.println("Number of characters = " + n);
        // Replace characters in string
        t = s.replace("Java", "C++"); 
        System.out.println(s); 
        System.out.println(t);
        // Concatenating string with another string
    }
}