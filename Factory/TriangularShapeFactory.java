import java.awt.*;

public class TriangularShapeFactory implements ShapeFactory{

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
