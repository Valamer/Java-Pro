package GeometricFigures;

public class Triangle implements Geometric {
    double sideOne, sideTwo, sideThree;
    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }
    public double getArea() {
        double halfPerimeter = (sideOne + sideTwo + sideThree) / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree));
    }
    public double getSideOne(){
        return sideOne;
    }
    public double getSideTwo(){
        return sideOne;
    }
    public void setSideTwo(double side){
        this.sideOne = side;
    }
    public void setSideOne(double side){
        this.sideOne = side;
    }
    public void setSideThree(double side){
        this.sideOne = side;
    }
    public double getSideThree(){
        return sideOne;
    }
}
