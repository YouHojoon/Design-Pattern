import java.awt.*;
import java.util.Arrays;

public class Parallelogram extends Shape{

    Parallelogram(String type, Point[] points) {
        super(type, points);
    }

    @Override
    double calcArea() {
        Point p = points[0];
        double width = Arrays.stream(points).filter(point -> point.getY()==p.getY()).map(Point::getX).reduce((a,b)->a-b).get();
        double height = p.getY()-Arrays.stream(points).filter(point -> point.getY()!=p.getY()).findAny().get().getY();

        return Math.abs(width * height);
    }
}
