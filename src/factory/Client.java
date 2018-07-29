package factory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape(1);
        rectangle.draw();
        Shape square = shapeFactory.createShape(2);
        square.draw();
        Shape circle = shapeFactory.createShape(3);
        circle.draw();
    }
}
