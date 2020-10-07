import java.awt.*;

public abstract class Shape {

    protected String type;
    protected Point[] points;

    Shape(String type, Point[] points) {
        this.points = points;
        this.type = type;
    }

    abstract double calcArea();

    @Override
    public String toString() {
        String result = type+"\n";

        for (int i = 0; i < points.length; i++)
            result += "P" + i + ": " + points[i].toString()+"\n";
        return result+"area: "+calcArea();
    }
}
