public class Greeting {

    public static String greet(String name) {
        return "Goodbye, " + name + "!"; // BUG: should be "Hello"
    }

    public static void main(String[] args) {
        System.out.println(greet("World"));
    }
}