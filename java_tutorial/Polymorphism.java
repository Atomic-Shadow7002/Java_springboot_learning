import java.nio.channels.Pipe.SourceChannel;

class A {

    public void show() {
        System.out.println("in A Show");
    }
}

class B extends A {

    public void show() {
        System.out.println("in B Show");
    }
}

class C extends A {

    public void show() {
        System.out.println("in C Show");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // Final Keyword -  it can be variable, method, class(when you make a class final you can't have inheritence)
        final double pi = 3.14;
        System.out.println(pi);
    }
}
