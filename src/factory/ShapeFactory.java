package factory;

public class ShapeFactory {
    public Shape createShape(int id) {
        if (id == 1)
            return new Rectangle();
        else if (id == 2)
            return new Square();
        else if (id == 3)
            return new Circle();
        else
            return null;
    }
}
