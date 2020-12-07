package hw7;

public class Cat {
    private String name;
    private int hunger;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
        this.hunger = 10;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate){
        if (plate.getQuantityFood() >= hunger) {
            System.out.println("Cat " + name + " eats...");
            plate.decreaseFood(hunger);
            satiety = true;
        }else {
            System.out.println("Cat " + name + " couldn't eat because not enough food on the plate.");
        }
    }

    public void getSatiety() {
        if (satiety == true){
            System.out.println("Cat " + name + " is full satiety.");
        }else {
            System.out.println("Cat " + name + " is very hungry.");
        }
    }



}
