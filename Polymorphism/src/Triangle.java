
import java.lang.Math;

public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;
    
    private double semiPerimeter;
    
    private Triangle () {}
    private Triangle (double sideAInput, double sideBInput) {}
    
    Triangle(double sideAInput,double sideBInput,double sideCInput){
        sideA = sideAInput;
        sideB = sideBInput;
        sideC = sideCInput;
        
        semiPerimeter = (sideA + sideB + sideC) / 2.0;
    }
    
    double calculatePerimeter () {
        return (sideA + sideB + sideC);
    }

    double calculateArea () {
        return (Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                                          (semiPerimeter - sideB) *
                                          (semiPerimeter - sideC)));
    }

}