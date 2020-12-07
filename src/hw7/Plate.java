package hw7;

public class Plate {
    private int quantityFood;

    public Plate(int quantityFood) {
        if (quantityFood > 0){
            this.quantityFood = quantityFood;
        }

    }

    public int getQuantityFood() {
        return quantityFood;
    }

    public void decreaseFood(int amount){
        if (amount < 0){
            return;
        }
        this.quantityFood -= amount;
    }

    public void info(){
        System.out.println("Food: " + quantityFood);
    }

    public void fillFood (int food){
        if (food > 0) {
            quantityFood = quantityFood + food;
        }else {
            return;
        }

    }
}
