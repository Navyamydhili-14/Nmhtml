import java.util.*;

public class Methods {
    String hello(String name) {
        return "hello";
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println(m.hello(name));

    }
}