package task7.factory;

import task7.Developers.Developer;
import task7.Developers.DotNetDeveloper;

public class DotNetCourse extends ProgrammingCourse{
    @Override
    public Developer createDeveloper() {
        return new DotNetDeveloper(); // Возвращает .NET разработчика
    }
}
