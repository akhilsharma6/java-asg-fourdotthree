/* 4.3 Assignment: Assume that class A extends class B, which extends class C. Also all the three classes implement
the method test(). How can a method in a class A invoke the test() method defined in class C
(without creating a new instance of class C). */

class C {
    public void test() {
	System.out.println("I am a test method from Class C");
    }
}
  
class B extends C {
    public void test() {       
	System.out.println("I am a test method from Class B");
    }
}
  
class A extends B {
    public void test() {
//	super.super.test();  //  It is not possible to invoke test() method defined in C from a method in A in Java.
    }
}
  
public class Main {
    public static void main(String[] args) {
	A a = new A();
        a.test();
    }
}

/* Output: F: It is not possible to invoke test() method defined in C from a method in A.
*/