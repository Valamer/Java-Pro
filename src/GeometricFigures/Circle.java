package GeometricFigures;

public class Circle implements Geometric{
    double diameter;
    public Circle(double diameter) {
        this.diameter = diameter;
    }
    public double getArea() {
        return Math.PI * Math.pow(diameter / 2, 2);
    }
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
}
