package Participants;

public interface Participant {
    void run(Racetrack obstacle);
    void jump(Wall obstacle);
    boolean overcome(Obstacle obstacle);
}
