//How to replace string with another string in java Program
public class str38 {
    public static void main(String[] args) {
        String s1="My name is Mayank. My name is Mausam. My name is techno."; 
        String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }
}
