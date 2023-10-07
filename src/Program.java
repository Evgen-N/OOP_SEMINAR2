public class Program {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();
    
        Cat[] cats = {
            new Cat("Барсик", 30, false),
            new Cat("Персик", 95, false),
            new Cat("Пушок", 80, false),
            new Cat("Соня", 55, false),
            new Cat("Арчи", 42, false)
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
                        eater.eat(plate.getFood());
                        plate.setFood(plate.getFood() - eater.getAppetite());
                        plate.info();
                    }
                }
    }
}