import java.util.Objects;

public class Rectangle extends Shape {
    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getArea(){return length * width;}

    public Double getRound(){return 2*(length+ width);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(length, rectangle.length) && Objects.equals(width, rectangle.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
