import java.awt.*;
import java.util.Arrays;

public class RightTriangle extends Shape{

    RightTriangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    double calcArea() {
        Point p = points[0];
        double height = Arrays.stream(points).filter(point -> point.getX() == p.getX()).map(Point::getY)
                .reduce((a,b)->(a-b)).get();
        double width = Arrays.stream(points).filter(point -> point.getX() != p.getX()).findAny().get().getX() - p.getX();


        return Math.abs(width * height) / 2;
    }
}
