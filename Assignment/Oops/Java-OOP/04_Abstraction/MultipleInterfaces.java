interface Printable { void print(); }
interface Showable { void show(); }
class Document implements Printable, Showable {
    public void print() { System.out.println("Hello"); }
    public void show() { System.out.println("Welcome"); }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Document obj = new Document();
        obj.print();
        obj.show();
    }
}
