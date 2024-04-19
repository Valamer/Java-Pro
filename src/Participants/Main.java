package Participants;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Participant> participants = new ArrayList<>();
        participants.add(new Human("Паша",200,0.5));
        participants.add(new Cat("Мурзік",80,1));
        participants.add(new Robot("Железяка",300,0.2));
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Wall("Стіна низька",0.2));
        obstacles.add(new Racetrack("Дорожка коротка",30));
        obstacles.add(new Wall("Стіна середня",0.5));
        obstacles.add(new Wall("Стіна висока",1));
        obstacles.add(new Racetrack("Дорожка середня",100));
        obstacles.add(new Racetrack("Дорожка довга",250));

        startContest(participants,obstacles);
    }

    public static void startContest(ArrayList<Participant> participants, ArrayList<Obstacle> obstacles) {
        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                if (!o.overcome(p)) { break; }
            }
        }
    }
}
