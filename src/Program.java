public class Program {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();
    
        Cat[] cats = {
            new Cat("Барсик", 10, false),
            new Cat("Персик", 25, false),
            new Cat("Пушок", 20, false),
            new Cat("Соня", 25, false),
            new Cat("Арчи", 28, false)
        };

        for (Cat eater : cats) {
                    if (eater.eat(plate.getFood())){
                        plate.setFood(plate.getFood() - eater.getAppetite());
                        plate.info();
                        eater.setFullness(true);
                    }
                    else {
                        plate.addFood(100);
                        System.out.printf("В тарелку добавлено 100 корма.\n");
                        plate.info();
                    }
                }
    }
}