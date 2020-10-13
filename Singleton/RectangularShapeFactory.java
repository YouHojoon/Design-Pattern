import java.awt.*;

public class RectangularShapeFactory implements ShapeFactory {

    private volatile static RectangularShapeFactory instance;

    private RectangularShapeFactory(){}

    public static RectangularShapeFactory getInstance() {
        if (instance == null) {
            synchronized (RectangularShapeFactory.class) {
                if (instance == null)
                    instance = new RectangularShapeFactory();
            }
        }
        return instance;
    }

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
