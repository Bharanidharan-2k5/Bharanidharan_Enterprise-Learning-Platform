class Bank {
    int getRateOfInterest() { return 0; }
}
class SBI extends Bank {
    int getRateOfInterest() { return 8; }
}
class ICICI extends Bank {
    int getRateOfInterest() { return 7; }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        System.out.println("SBI Rate: " + s.getRateOfInterest());
        System.out.println("ICICI Rate: " + i.getRateOfInterest());
    }
}
