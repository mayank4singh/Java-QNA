//How to convert Fahrenheit to Celsius Program in java
import java.util.Scanner;

public class convert5 {
    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter temperatue in Fahrenheit"); 
                temp = sc.nextInt();
                temp = ((temp - 32)*5)/9;
            System.out.println("Temperatue in Celsius = " + temp);
}
}
    
