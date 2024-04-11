public abstract class Animal {

    private static int animalCounter = 0;
    String name;
    double runDistance;
    double swimDistance;

    public void run (double obstacleLength){
        if (runDistance >= obstacleLength) System.out.println(name + " has run " + obstacleLength + " meters");
        else System.out.println(name + " failed to run " + obstacleLength + " meters, stopping at " + runDistance + " meters");
    }
    public void swim (double obstacleLength){
        if (swimDistance >= obstacleLength) System.out.println(name + " has swim " + obstacleLength + " meters");
        else System.out.println(name + " failed to swim " + obstacleLength + " meters, stopping at " + swimDistance + " meters");
    }
    public static int getAnimalCount (){
        return animalCounter;
    }

    public static void increaseAnimalCounter () {
        animalCounter++;
    }
}
