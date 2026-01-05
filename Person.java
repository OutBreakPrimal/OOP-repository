public class Person {
    private String firstName;
    private String lastName;

    // Конструктор (в коде на скриншоте опечатка "Public" с большой буквы, должно быть "public")
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Изменяем protected на public
    public String getFirstName() {
        return firstName;
    }

    // Добавляем public (раньше был default)
    public String getLastName() {
        return lastName;
    }

    // Изменяем private на public
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
