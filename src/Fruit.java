public class Fruit {
    public Fruit(String name){
        this.name = name;
    }
    public String name;

    @Override
    public String toString() {
        return "Fruit:" +
                "name = " + name;
    }
}
