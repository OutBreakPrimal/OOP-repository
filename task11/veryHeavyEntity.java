package task11;

import java.util.concurrent.TimeUnit;

public class veryHeavyEntity implements Entity {
    private final int id;

    private veryHeavyEntity(int id) {
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.id = id;
    }
    public static veryHeavyEntity load(int id) {
        System.out.println("Data is being initialized... This may take a few minutes...");
        veryHeavyEntity entity = new veryHeavyEntity(id);
        System.out.println("Data initialization completed!");
        return new veryHeavyEntity(id);
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public String find(String query) {
        return "Nothing found.";
    }
}
