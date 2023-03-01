//Difference between Static and Instance method working in java Program
public class diff45 {
    public static void main(String[] args) {
        display();
        diff45 t = new diff45(); 
        t.show(); //calling using object
        }
        static void display() { System.out.println("Programming is amazing.");
        }
        void show(){
        System.out.println("Java is awesome.");
        
    }
}
