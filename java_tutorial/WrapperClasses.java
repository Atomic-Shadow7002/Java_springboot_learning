

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 7;

        // Integer num1 = Integer.valueOf(num); below line does the same thing, instead of creating a new object which will be a waste of memory, here we have cached the object
        Integer num1 = num; // Autoboxing, converts primptive value to object

        int num2 = num1; //Auto-unboxing, getting the value from object type and converting to primitive type

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3*2);
    }
}
