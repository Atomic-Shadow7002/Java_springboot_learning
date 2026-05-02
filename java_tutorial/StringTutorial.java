public class StringTutorial {
    public static void main(String[] args) {

        String name = new String("Alex");
        System.out.println(name);
        System.out.println(name.concat(" Smith"));
        System.out.println(name.charAt(2));

        String s1 = "Alex";
        String s2 = "Alex";
        System.out.println(s1 == name); // Here s1 points to string pool and name points to heap memory, cuz new keyword
                                        // forces a new object.
        System.out.println(s1 == s2); // Here true as both points to string pool

        // By default String are immutable and to make it mutable we need to use String
        // Buffer or String Builder

        StringBuffer sb = new StringBuffer("Alex"); // A string buffer is like a String, but can be modified.
        sb.append(" Smith");
        sb.deleteCharAt(0);

        System.out.println(sb);

    }
}
