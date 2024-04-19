package Participants;

public class Human implements Participant {
    String name;
    double runDistance;
    double jumpHeight;

    public Human(String name, double runDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public boolean run(Racetrack obstacle) {
        if (runDistance >= obstacle.length) {
            System.out.println("Людина " + this.name + " пробігла перешкоду " + obstacle.name + " на дистанції " + obstacle.length);
            return true;
        } else {
            System.out.println("Людина " + this.name + " не пробігла перешкоду " + obstacle.name + " на дистанції " + obstacle.length + ". Пройдено " + runDistance);
            return false;
        }
    }

    public boolean jump(Wall obstacle) {
        if (jumpHeight >= obstacle.height) {
            System.out.println("Людина " + this.name + " перепригнула перешкоду " + obstacle.name + " висотою " + obstacle.height);
            return true;
        } else {
            System.out.println("Людина " + this.name + " не перепригнула перешкоду " + obstacle.name + " висотою " + obstacle.height + ", пригнувши " + jumpHeight);
            return false;
        }
    }

}
