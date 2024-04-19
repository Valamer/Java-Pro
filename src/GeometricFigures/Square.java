package GeometricFigures;

public class Square implements Geometric {
    double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
}
