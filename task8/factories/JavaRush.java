package task8.factories;

import task8.Juniors.JavaJun;
import task8.Juniors.JuniorDeveloper;
import task8.Middles.JavaMiddle;
import task8.Middles.MiddleDeveloper;
import task8.Seniors.JavaSenior;
import task8.Seniors.SeniorDeveloper;

public class JavaRush implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new JavaJun();
    }
    public MiddleDeveloper createMiddle() {
        return new JavaMiddle();
    }
    public SeniorDeveloper createSenior() {
        return new JavaSenior();
    }
}
