package Participants;

public class Robot implements Participant{
    String name;
    double runDistance;
    double jumpHeight;

    public Robot(String name, double runDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run(Racetrack obstacle) {
        if (runDistance >= obstacle.length) {
            System.out.println("Робот " + this.name + " пробіг перешкоду " + obstacle.name + " на дистанції " + obstacle.length);
        } else {
            System.out.println("Робот " + this.name + " не пробіг перешкоду " + obstacle.name + " на дистанції " + obstacle.length + ". Пройдено " + runDistance);
        }
    }

    public void jump(Wall obstacle) {
        if (jumpHeight >= obstacle.height) {
            System.out.println("Робот " + this.name + " перепригнув перешкоду " + obstacle.name + " висотою " + obstacle.height);
        } else {
            System.out.println("Робот " + this.name + " не перепригнув перешкоду " + obstacle.name + " висотою " + obstacle.height + ", пригнувши " + jumpHeight);
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
