public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("корма в тарелке: " + food);
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void addFood(int addfood) {
        this.food = food + addfood;
    }
}