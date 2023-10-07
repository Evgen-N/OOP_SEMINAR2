public interface Eat {

    String getName();

    int getAppetite();

    int getFood();

    default boolean eat(int plate){
        if (plate >= getAppetite()){
            System.out.printf("%s съел %d корма. ", getName(), getAppetite());
            System.out.printf("%s сыт.\n", getName());
            return true;
        }
        else{
            System.out.printf("%s не смог съесть %d корма.\n", getName(), getAppetite());
            return false;
        }
    }
}
