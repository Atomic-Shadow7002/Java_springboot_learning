class A {
    public A() {
        super(); //Every constructor has a super method, Even though we dont right super it is still there and it calls the constructor of the super class or the parent class 
        System.out.println("In A");
    }
    public A(int n) {
        super();
        System.out.println("In A int ");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("In B");
    }
    public B(int n) {
        this(); // This method calls the constructor of the same class
        // super(n); // It will call the default constructor of the parent or super class by default as super is always present but if we want it to call the parameterized one, we have to pass some arguments
        System.out.println("In B int ");
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        B obj =  new B(5); // It will call the parameterized costructor not the default one if we pass some values
    }
}
