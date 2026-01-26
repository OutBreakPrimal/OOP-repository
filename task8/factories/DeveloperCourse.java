package task8.factories;

import task8.Juniors.JuniorDeveloper;
import task8.Middles.MiddleDeveloper;
import task8.Seniors.SeniorDeveloper;

public interface DeveloperCourse {
    JuniorDeveloper createJunior();
    MiddleDeveloper createMiddle();
    SeniorDeveloper createSenior();
}
