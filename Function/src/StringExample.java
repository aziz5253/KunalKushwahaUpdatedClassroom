package Function.src;
public class StringExample {
    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println(myGreet("Aziz"));

    }

    private static String myGreet(String greet) {
        String message = "Hello "+ greet;
        return message;
    }

    static String greet(){
        return "how are you";
    }
}

