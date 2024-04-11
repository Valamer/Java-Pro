public class Dog extends Animal{

    private static int dogCounter = 0;

    public Dog(String name){
        this.name = name;
        super.runDistance = 500;
        super.swimDistance = 10;
        increaseAnimalCounter();
        dogCounter++;
    }

    public static int getDogCount(){
        return dogCounter;
    }

}
