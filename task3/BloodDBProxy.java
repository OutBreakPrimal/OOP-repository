package task3;
import java.util.List;
import java.util.Scanner;

    public class BloodDBProxy implements DB {
        private final SecuritySystem security;
        private BloodDB db;
        private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

        public BloodDBProxy() {
            this.security = new SecuritySystem();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            security.authorize(login, password);

            if (security.isAuthorized()) {
                this.db = new BloodDB();
            }
        }

        @Override
        public BloodSample getById(int id) {
            return security.isAuthorized() ? db.getById(id) : denied;
        }

        @Override
        public List<BloodSample> find(String request) {
            return security.isAuthorized() ? db.find(request) : List.of(denied);
        }
    }

