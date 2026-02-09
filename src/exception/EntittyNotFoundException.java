package exception;

public class EntittyNotFoundException extends ClinicException {
    public EntittyNotFoundException(String entityName, int id) {
        super(entityName + " with ID " + id + " not found!");
    }
}
