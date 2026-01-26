package task7.factory;

import task7.Developers.Developer;
import task7.Developers.JavaDeveloper;

public class JavaRush extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
