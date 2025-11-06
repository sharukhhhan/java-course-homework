package errors;

import java.util.Objects;

public class UserService {
    public static void registerUser(String email, String password) throws EmailIsNullException {
        // save user in db
        if (Objects.equals(email, "")) {
            throw new EmailIsNullException();
        }
    }
}
