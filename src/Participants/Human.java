package Participants;

public class Human implements Participant{
    String name;
    double runDistance;
    double jumpHeight;

    public Human(String name, double runDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run(Racetrack obstacle) {
        if (runDistance >= obstacle.length) {
            System.out.println("Людина " + this.name + " пробігла перешкоду " + obstacle.name + " на дистанції " + obstacle.length);
        } else {
            System.out.println("Людина " + this.name + " не пробігла перешкоду " + obstacle.name + " на дистанції " + obstacle.length + ". Пройдено " + runDistance);
        }
    }

    public void jump(Wall obstacle) {
        if (jumpHeight >= obstacle.height) {
            System.out.println("Людина " + this.name + " перепригнула перешкоду " + obstacle.name + " висотою " + obstacle.height);
        } else {
            System.out.println("Людина " + this.name + " не перепригнула перешкоду " + obstacle.name + " висотою " + obstacle.height + ", пригнувши " + jumpHeight);
        }

    }

    public boolean overcome(Obstacle obstacle) {
        if (obstacle.getClass() == Racetrack.class) {
            run((Racetrack) obstacle);
            return runDistance >= ((Racetrack) obstacle).length;
        }
        if (obstacle.getClass() == Wall.class) {
            jump((Wall) obstacle);
            return jumpHeight >= ((Wall) obstacle).height;
        }
        System.out.println("Невідома перешкода");
        return false;
    }
}
