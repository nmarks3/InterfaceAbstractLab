package lab1;

import javax.swing.JOptionPane;

/**
 * See ProgrammingClass
 *
 * @Nolan Marks
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingClass {

    public IntroToProgrammingCourse(String courseName, String courseNumber,
            double credits, String prerequisites) {
        this.setInfo(courseName, courseNumber, credits, prerequisites);
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = "None"; // Need to make this private somehow
    }

}
