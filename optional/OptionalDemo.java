package optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {

    public static void main(String[] args) {
        
        String message = sayHelo();
        if(message != null) {
            System.err.println(message.toUpperCase());
        }

        Optional<String> optionalMsg = sayHi();
        if(!optionalMsg.isEmpty()) {
            System.err.println(optionalMsg.get().toUpperCase());
        }

        optionalMsg.ifPresent(msg -> System.err.println("ifPresent: " + msg.toUpperCase()));
        optionalMsg.ifPresentOrElse(msg -> System.err.println("ifPresent: " + msg.toUpperCase()),
    () -> System.err.println("Value is present"));

        String msg1 = optionalMsg.orElse("Valie is absent");
        System.err.println("ifPrsent: " + msg1);

        String msg2 = optionalMsg.orElseGet(() -> "Value is absent");
        System.err.println("OrElseGet: " + msg2);

        // String msg3 = optionalMsg.orElseThrow();
        // String msg3 = optionalMsg.orElseThrow(() -> new IllegalStateException("Value is absent"));
        // System.err.println("orElseThrow" + msg3);

        Optional<String> mapOptionalStr = optionalMsg.map(String::toUpperCase);
        System.err.println(mapOptionalStr);

        Optional<String> filterOptionalStr = optionalMsg.filter(value -> value.length() > 5);
        System.err.println(filterOptionalStr);
    }

    public static String sayHelo() {
        int num = new Random().nextInt();

        System.err.println(num);
        if(num % 2 == 0) {
            return "Hello World";
        }
        return null;
    }

    public static Optional<String> sayHi() {
        int num = new Random().nextInt();
        System.err.println(num);

        String msg = null;
        if(num % 2 == 0) {
            msg = "Hi World";
        }

        return Optional.ofNullable(msg);
    }
}