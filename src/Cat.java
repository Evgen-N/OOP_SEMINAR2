public class Cat implements Eat {
    private String name;
    private int appetite;
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }
    public boolean isFullness() {
        return fullness;
    }
    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    // public void eat() {

    @Override
    public boolean eat(int plate){
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
    @Override
    public int getFood() {
        return getFood();
    }
}