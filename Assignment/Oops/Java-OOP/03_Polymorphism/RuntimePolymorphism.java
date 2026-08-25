class Animal {
    void eat() { System.out.println("eating"); }
}
class Dog extends Animal {
    void eat() { System.out.println("eating fruits"); }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog(); // Runtime polymorphism
        a.eat();
    }
}
