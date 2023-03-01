//How to throw exception in java Program
import java.lang.ArithmeticException;

public class throw50 {
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote on Mayank");
        }
        public static void main(String args[]){
            validate(13);
            System.out.println("rest of the code...");

}
}
