package v2;

public class Rectangle implements Sortable {
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
    public boolean isBigger(Sortable other) {
        Rectangle o = (Rectangle) other;
        return o.area() > this.area();
    }
}
