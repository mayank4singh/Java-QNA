import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

//How to create method in java Program
public class meth42 {
    meth42() {
        System.out.println("Constructor method is called when an object of it's class is created");
        }
        // Main method where program execution begins
    public static void main(String[] args) {
        staticMethod();
        meth42 object = new meth42(); object.nonStaticMethod();
        }
        // Static method
        static void staticMethod() {
        System.out.println("Static method can be called without creating object");
        }
        // Non static method
        void nonStaticMethod() {
        System.out.println("Non static method must be called by creating an object");
        
    }
}
