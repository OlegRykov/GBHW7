package hw7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(35);
        Cat[] cats = {
                new Cat("Barsik"),
                new Cat("Myrzik"),
                new Cat("Tom"),
                new Cat("Gav")
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (Cat cat : cats) {
            cat.getSatiety();
        }
        plate.info();
        plate.fillFood(50);
        plate.info();
    }

}
