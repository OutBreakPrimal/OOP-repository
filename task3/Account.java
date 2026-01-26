package task3;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Account {
    private final User user;
    private final String login;
    final String password;

    public Account(int id, String firstName, String lastName, Object photo, String login, String password) {
        this.user = new User(id, firstName, lastName, photo);
        this.login = login;
        this.password = Base64.getEncoder().encodeToString(password.getBytes(StandardCharsets.UTF_8));
    }
}
