package Participants;

public class Racetrack implements Obstacle {
    String name;
    double length;
    public Racetrack(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public boolean overcome(Participant participant) {
        return participant.run(this);
    }
}
