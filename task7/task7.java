package task7;

import task7.factory.DotNetCourse;
import task7.factory.JavaRush;
import task7.factory.KotlinCourse;
import task7.factory.ProgrammingCourse;

public class task7 {
    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("web");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }
    static void startLearningProcess() {
        course.educateStudent();
    }
}
