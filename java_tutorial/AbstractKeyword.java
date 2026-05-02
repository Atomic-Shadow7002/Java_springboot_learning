abstract class Car { // Abstract classes cannot be instantiated directly, it must be extended by subclasses
    public abstract void drive(); // No implemetation(body), it should be overrided by subclasses

    public abstract void superSpeed();

    public void playMusic() {
        System.out.println("Playing music");
    }
}

abstract class WagonR extends Car { // Here if any abstarct method is not implemented than it should as well become a abstract class
    @Override
    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdateWagonR extends WagonR { // Now all abstract method is implemented
    @Override
    public void superSpeed() {
        System.out.println("Super Speed");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        UpdateWagonR obj = new UpdateWagonR();
        obj.drive();
        obj.playMusic();
        obj.superSpeed();
    }
}
