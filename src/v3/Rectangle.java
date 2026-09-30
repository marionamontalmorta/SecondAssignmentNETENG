package v3;

public class Rectangle implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public void print() {
        System.out.println(width + " x " + height + " -> area " + area());
    }

    @Override
    public int compareTo(Rectangle other) {
        return Double.compare(this.area(), other.area());
    }
}
