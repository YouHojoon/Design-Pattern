import java.awt.*;

public class RectangularShapeFactory implements ShapeFactory {

    @Override
    public Shape create(String type, Point[] points) {
        Shape shape = null;
        switch (type) {
            case "Rectangle":
                shape = new Rectangle(type, points);
                break;
            case "Parallelogram":
                shape = new Parallelogram(type, points);
                break;
            case "Trapezoid":
                shape = new Trapezoid(type, points);
                break;
        }
        return shape;
    }
}
