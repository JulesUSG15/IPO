package src;
public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double surface() {
        return length * width;
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