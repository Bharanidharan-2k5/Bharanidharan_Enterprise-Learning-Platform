class A {
    A() { System.out.println("Parent class constructor invoked"); }
}
class B extends A {
    B() { System.out.println("Child class constructor invoked"); }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        B b = new B();
    }
}
