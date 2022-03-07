package Optional_Usage;
import java.util.Optional;
import java.util.optional;
public class User {
        Optional<User> user = Optional.ofNullable(getUser());
        String result = user
                .map(User::getAddress)
                .map(Address::getStreet)
                .orElse("not specified");
        }
