
import java.util.ArrayList;
import java.util.Arrays;


public class ShapeCalculator {
    public static void main (String[] args)
    {
        Circle circle = new Circle(5);

        Triangle triangle = new Triangle (3,2,4);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(4,5);
        
        Rectangle square = new Rectangle();
        square.setDimensions(6);
        
        ArrayList <Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(rectangle);
        shapes.add(square);
        
        for(Shape eachShape : shapes)
        {
            System.out.println("Area of shape : " + eachShape.calculateArea());
            System.out.println("Perimeter of shape : " + eachShape.calculatePerimeter());
        }

    }
}