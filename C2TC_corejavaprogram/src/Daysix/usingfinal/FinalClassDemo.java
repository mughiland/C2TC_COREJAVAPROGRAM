package Daysix.usingfinal;

//Final class declaration
final class FinalClass {
 void show() {
     System.out.println("Final class cannot be inherited");
 }
}

//This will cause a compile-time error, so it should be commented or removed.
//class FinalChildClass extends FinalClass {
//  // Error: Cannot inherit from final class
//}

public class FinalClassDemo {
 public static void main(String[] args) {
     // Create the object of final class
     FinalClass f1 = new FinalClass();
     f1.show();
 }
}
