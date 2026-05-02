class Laptop {

    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hello";
    }

    public boolean equals(Laptop that) {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class Object {

    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.setModel("Iphone");
        lap1.setPrice(150000);

        Laptop lap2 = new Laptop();
        lap2.setModel("Iphone");
        lap2.setPrice(150000);

        boolean result = lap1.equals(lap2);

        System.out.println(result);
        
    }
}
