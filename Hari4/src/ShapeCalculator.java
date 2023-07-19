public class ShapeCalculator {
    public void sumArea(Shape []shapes){
        Double totalShapeArea =0.0;

        for (Shape shape : shapes){
            totalShapeArea += shape.getArea();
        }
        System.out.println(totalShapeArea);
    }
}
