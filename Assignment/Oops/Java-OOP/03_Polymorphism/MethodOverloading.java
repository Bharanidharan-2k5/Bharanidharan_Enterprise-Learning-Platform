class MathOps {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOps m = new MathOps();
        System.out.println("Sum of 2 numbers: " + m.add(10, 20));
        System.out.println("Sum of 3 numbers: " + m.add(10, 20, 30));
    }
}
