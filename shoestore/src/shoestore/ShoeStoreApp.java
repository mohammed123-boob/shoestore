abstract class Shoe {

    private String name;

    public Shoe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showInfo();
}

class SportsShoe extends Shoe {

    public SportsShoe(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + " is a sports shoe.");
    }
}

class FormalShoe extends Shoe {

    public FormalShoe(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println(getName() + " is a formal shoe.");
    }
}

class ShoeStore<T extends Shoe> {

    private T shoe;

    public void addShoe(T shoe) {
        this.shoe = shoe;
        System.out.println("Shoe added successfully.");
    }

    public void showShoe() {
        if (shoe != null) {
            shoe.showInfo();
        } else {
            System.out.println("No shoe available.");
        }
    }

    public T getShoe() {
        return shoe;
    }
}

public class ShoeStoreApp {

    public static void main(String[] args) {

        ShoeStore<SportsShoe> store1 = new ShoeStore<>();

        store1.addShoe(new SportsShoe("Nike"));
        store1.showShoe();

        System.out.println("--------------------");

        ShoeStore<FormalShoe> store2 = new ShoeStore<>();

        store2.addShoe(new FormalShoe("Classic"));
        store2.showShoe();
    }}
