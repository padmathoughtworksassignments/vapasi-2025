

public class Rectangle extends Shape {
    
    double length, width;
    
    Rectangle () {}
    private Rectangle (int lengthInput) {}
    private Rectangle (int lengthInput, int widthInput) {}
    private Rectangle (double lengthInput) {}
    private Rectangle (double lengthInput, double widthInput) {}
    
    void setDimensions (double lengthInput)
    {
        length = width = lengthInput;
    }
    
    void setDimensions (double lengthInput, double widthInput)
    {
        length = lengthInput;
        width = widthInput;
    }
    
    double calculatePerimeter () {
        return (2 * (length + width));
    }

    double calculateArea () {
        return (length * width);
    }

}