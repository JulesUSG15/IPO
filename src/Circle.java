package src;
public class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double surface() {
        return Math.PI * radius * radius;
    }

    public int compareTo(Shape s) {
        if (this.surface() > s.surface()) {
            return 1;
        } else if (this.surface() < s.surface()) {
            return -1;
        } else {
            return 0;
        }
    }
}