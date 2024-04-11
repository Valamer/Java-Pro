public class Cat extends Animal{

    private static int catCounter = 0;

    public Cat(String name){
        this.name = name;
        super.runDistance = 200;
        super.swimDistance = 0;
        increaseAnimalCounter();
        catCounter++;
    }

    public static int getCatCount(){
        return catCounter;
    }

}
