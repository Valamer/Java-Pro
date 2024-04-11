public class Cat extends Animal{

    private static int catCounter = 0;
    double runDistance = 200;
    double swimDistance = 0;

    public Cat(String name){
        this.name = name;
        increaseAnimalCounter();
        catCounter++;
    }

    public static int getCatCount(){
        return catCounter;
    }

}
