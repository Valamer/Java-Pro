package GeometricFigures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Geometric> list = new ArrayList<>();
        list.add(new Triangle(4,4,5));
        list.add(new Triangle(3,4,2));
        list.add(new Square(5));
        list.add(new Square(2));
        list.add(new Circle(3));
        list.add(new Circle(5));

        System.out.println(calculateArea(list));
    }
    public static double calculateArea(ArrayList<Geometric> list) {
        double area = 0;
        for (Geometric figure : list) {
            area += figure.getArea();
        }
        return area;
    }
}
