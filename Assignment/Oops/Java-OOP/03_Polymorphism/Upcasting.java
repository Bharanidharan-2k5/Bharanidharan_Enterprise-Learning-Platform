class Machine {
    void start() { System.out.println("Machine started."); }
}
class Laptop extends Machine {
    void start() { System.out.println("Laptop started."); }
}

public class Upcasting {
    public static void main(String[] args) {
        Machine m = new Laptop(); // Upcasting
        m.start();
    }
}
