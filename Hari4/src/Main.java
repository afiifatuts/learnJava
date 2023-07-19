// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle kotak = new Rectangle(1.0,2.0);
        System.out.println(kotak);
        System.out.println(kotak.getArea());

        Circle circle = new Circle(7.0);
        System.out.println(circle);
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle(1.0,2.0);
        System.out.println(triangle);
        System.out.println(triangle.getArea());
    }
}