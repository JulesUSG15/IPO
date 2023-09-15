package TD1.src;
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3.0, 4.0);
        Circle c = new Circle(5);
        System.out.println(r.surface());
        System.out.println(c.surface());
        System.out.println(r.compareTo(c));
        System.out.println(c.compareTo(r));
    }
}