import java.awt.*;

public class TriangularShapeFactory implements ShapeFactory {

    private volatile static TriangularShapeFactory instance;

    private TriangularShapeFactory(){}

    public static TriangularShapeFactory getInstance() {
        if (instance == null) {
            synchronized (TriangularShapeFactory.class) {
                if (instance == null)
                    instance = new TriangularShapeFactory();
            }
        }
        return instance;
    }

    @Override
    public Shape create(String type, Point[] points) {
        Shape shape = null;

        switch (type) {
            case "Triangle":
                shape = new Triangle(type, points);
                break;
            case "RightTriangle":
                shape = new RightTriangle(type, points);
                break;
        }
        return shape;
    }
}
