public class interfaces_task10 {
        public static void main(String[] args) throws Exception {
        }
        interface Person{
            void use(Person person);
            void startToWork();
        }
        interface HasManagementPotential extends Boss{
            boolean inspiresOthersToWork();
        }
        interface Secretary extends Person {
        }
        interface Boss extends Person {
        }
        class Manager implements HasManagementPotential {
            public void use(Person person) {
                person.startToWork();
            }
            public void startToWork() {
            }
            public boolean inspiresOthersToWork() {
                return true;
            }
        }
        class Subordinate implements Secretary{
            public void use(Person person) {
            }

            public void startToWork() {
            }
        }
    }
