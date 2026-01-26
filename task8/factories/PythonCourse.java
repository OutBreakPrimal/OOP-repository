package task8.factories;

import task8.Juniors.PythonJun;
import task8.Juniors.JuniorDeveloper;
import task8.Middles.PythonMiddle;
import task8.Middles.MiddleDeveloper;
import task8.Seniors.PythonSenior;
import task8.Seniors.SeniorDeveloper;

public class PythonCourse implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new PythonJun();
    }
    @Override
    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }
    @Override
    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}
