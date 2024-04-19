package Participants;

public interface Participant {
    boolean run(Racetrack obstacle);
    boolean jump(Wall obstacle);
}
