package task7.Developers;

public class KotlinDeveloper extends JavaDeveloper implements Developer {
    @Override
    public void study() {
        super.study();
        System.out. println("Learning kotlin features...");
        writeCode();
    }
}
