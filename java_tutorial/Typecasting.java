class A {
    public void show1() {
        System.out.println("In Show 1");
    }
}
class B extends A {
    public void show2() {
        System.out.println("In Show 2");
    }
}

public class Typecasting {
    public static void main(String[] args) {

        A obj = new B(); // Upcasting
        obj.show1();

        B obj1 = (B) obj; // Downcasting
        obj1.show2();
    }
}
