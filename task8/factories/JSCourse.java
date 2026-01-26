package task8.factories;

import task8.Juniors.JSJunior;
import task8.Juniors.JuniorDeveloper;
import task8.Middles.JSMiddle;
import task8.Middles.MiddleDeveloper;
import task8.Seniors.JSSenior;
import task8.Seniors.SeniorDeveloper;

public class JSCourse implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new JSJunior();
    }
    @Override
    public MiddleDeveloper createMiddle() {
        return new JSMiddle();
    }
    @Override
    public SeniorDeveloper createSenior() {
        return new JSSenior();
    }
}
