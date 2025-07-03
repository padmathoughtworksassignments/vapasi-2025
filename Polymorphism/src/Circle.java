
import java.lang.Math;

public class Circle extends Shape {
    int radius;
    
    private Circle () {}
    
    Circle (int radiusInput) {
        radius = radiusInput;
    }
    
    double calculatePerimeter () {
        return (2 * Math.PI * radius);
    }

    double calculateArea () {
        return (Math.PI * Math.pow(radius,2));
    }
}