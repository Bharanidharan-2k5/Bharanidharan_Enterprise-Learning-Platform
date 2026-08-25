class Car {
    private boolean isEngineOn;
    public void startEngine() {
        isEngineOn = true;
        System.out.println("Engine started.");
    }
    public void stopEngine() {
        isEngineOn = false;
        System.out.println("Engine stopped.");
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
    }
}
