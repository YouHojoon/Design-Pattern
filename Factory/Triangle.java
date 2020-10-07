import java.awt.*;

public class Triangle extends Shape {

    Triangle(String type, Point[] points) {
        super(type, points);
    }

    @Override
    double calcArea() {
        double a = points[0].distance(points[1]);
        double b = points[0].distance(points[2]);
        double c = points[1].distance(points[2]);
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }
}
