import java.awt.*;
import java.util.Arrays;

public class Trapezoid extends Shape {

    Trapezoid(String type, Point[] points) {
        super(type, points);
    }

    @Override
    double calcArea() {
        Point p = points[0];
        Point y = Arrays.stream(points).filter(point -> point.getY() != p.getY()).findAny().get();
        double d1 = Math.abs(Arrays.stream(points).filter(point -> point.getY() == p.getY()).map(Point::getX).reduce((a, b) -> a - b).get());
        double d2 = Math.abs(Arrays.stream(points).filter(point -> point.getY() != p.getY()).map(Point::getX).reduce((a, b) -> a - b).get());
        double height = p.getY() - y.getY();

        return Math.abs((d1 + d2) * height / 2);
    }
}
