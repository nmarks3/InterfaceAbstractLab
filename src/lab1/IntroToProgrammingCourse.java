package lab1;

import javax.swing.JOptionPane;

/**
 * See ProgrammingClass
 *
 * @Nolan Marks
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    public IntroToProgrammingCourse(String courseName, String courseNumber,
            double credits, String prerequisites) {
        setInfo(courseName, courseNumber, credits, prerequisites);
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        this.setPrerequisites("None"); 
    }

}
