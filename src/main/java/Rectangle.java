public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double recWidth, double recHeight) {
        width = recWidth;
        height = recHeight;
    }

    public static double area(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    public static double perimeter(Rectangle rectangle) {
        return 2 * (rectangle.width + rectangle.height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4.0, 3.0);
        Rectangle rectangle2 = new Rectangle(1.5, 3.5);

        System.out.println("Rectangle 1 Area: " + area(rectangle1));
        System.out.println("Rectangle 1 Perimeter: " + perimeter(rectangle1));
        System.out.print("\n");
        System.out.println("Rectangle 2 Area: " + area(rectangle2));
        System.out.println("Rectangle 2 Perimeter: " + perimeter(rectangle2));
    }
}
