package task7.factory;

import task7.Developers.Developer;
import task7.Developers.KotlinDeveloper;

public class KotlinCourse  extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
