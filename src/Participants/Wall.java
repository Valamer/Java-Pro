package Participants;

public class Wall implements Obstacle{
    String name;
    double height;
    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }
}
