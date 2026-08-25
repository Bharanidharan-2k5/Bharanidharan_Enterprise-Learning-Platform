class Box {
    double width, height, depth;
    Box(double w, double h, double d) { width = w; height = h; depth = d; }
    Box() { width = height = depth = 0; }
    Box(double len) { width = height = depth = len; }
    void volume() { System.out.println("Volume: " + (width*height*depth)); }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 15);
        Box b2 = new Box();
        Box b3 = new Box(7);
        b1.volume(); 
        b2.volume(); 
        b3.volume();
    }
}
