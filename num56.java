import java.util.*;

//How to Generate random number in java Program
public class num56 {
    public static void main(String[] args) {
        int c;
        Random t = new Random();
        // random integers in [0, 100]
        for (c = 1; c <= 10; c++) { 
            System.out.println(t.nextInt(100));
}

    }
}