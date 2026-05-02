class Mobile {
    String brand;
    int price;
    static String name;

    public void show() { // Instance method
        System.out.println(brand + " " + price + " " + name);
    }

    static {
        name = "Phone";
        System.out.println("In Static block");
    }

    public Mobile() {
        brand = "";
        price = 0;
        System.out.println("In Constructor");
    }

    public static void show1(Mobile obj) { // Static Method
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

public class StaticTutorial {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 65000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Smasung";
        obj2.price = 100000;

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);

    }
}
