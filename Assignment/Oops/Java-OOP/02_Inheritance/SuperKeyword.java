class Parent {
    String color = "white";
}
class Child extends Parent {
    String color = "black";
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.printColor();
    }
}
