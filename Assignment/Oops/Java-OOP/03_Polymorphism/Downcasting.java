class Animal {}
class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}

public class Downcasting {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting first
        Dog d = (Dog) a;      // Downcasting
        d.bark();
    }
}
