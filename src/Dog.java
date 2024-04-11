public class Dog extends Animal{

    private static int dogCounter = 0;
    double runDistance = 500;
    double swimDistance = 10;

    public Dog(String name){
        this.name = name;
        increaseAnimalCounter();
        dogCounter++;
    }

    public static int getDogCount(){
        return dogCounter;
    }

}
