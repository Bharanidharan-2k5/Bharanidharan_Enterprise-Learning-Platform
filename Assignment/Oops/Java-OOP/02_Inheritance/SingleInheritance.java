class Vehicle {
    void run() { System.out.println("Vehicle is running"); }
}
class Bike extends Vehicle {
    void wheelie() { System.out.println("Bike is doing a wheelie"); }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
        b.wheelie();
    }
}
