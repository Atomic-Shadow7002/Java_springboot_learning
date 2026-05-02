class A {

    public void show() {
        System.out.println("In A show");
    }

    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("In B show");
    }
}

public class MethodOverridng {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        B obj1 = new A();
        obj1.config();
        obj1.show();
    }
}
