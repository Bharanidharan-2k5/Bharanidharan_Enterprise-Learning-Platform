abstract class Bike {
    Bike() { System.out.println("bike is created"); }
    abstract void run();
}
class Honda extends Bike {
    void run() { System.out.println("running safely"); }
}

public class AbstractClassConstructor {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
    }
}
