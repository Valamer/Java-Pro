package Participants;

public class Cat implements Participant {
    String name;
    double runDistance;
    double jumpHeight;

    public Cat(String name, double runDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public boolean run(Racetrack obstacle) {
        if (runDistance >= obstacle.length) {
            System.out.println("Кіт " + this.name + " пробіг перешкоду " + obstacle.name + " на дистанції " + obstacle.length);
            return true;
        } else {
            System.out.println("Кіт " + this.name + " не пробіг перешкоду " + obstacle.name + " на дистанції " + obstacle.length + ". Пройдено " + runDistance);
            return false;
        }
    }

    public boolean jump(Wall obstacle) {
        if (jumpHeight >= obstacle.height) {
            System.out.println("Кіт " + this.name + " перепригнув перешкоду " + obstacle.name + " висотою " + obstacle.height);
            return true;
        } else {
            System.out.println("Кіт " + this.name + " не перепригнув перешкоду " + obstacle.name + " висотою " + obstacle.height + ", пригнувши " + jumpHeight);
            return false;
        }
    }

}
