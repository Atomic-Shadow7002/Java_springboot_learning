public class inheritance {
    public static void main(String[] args) {
        SciCalc obj = new SciCalc();
        
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(3, 2);
        int r3 = obj.mul(11, 6);
        int r4 = obj.div(13, 2);
        double r5 = obj.power(9, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
